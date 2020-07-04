package io.github.tanghuibo.activitistudy.service;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.github.tanghuibo.activitistudy.request.DeploymentQueryParam;
import io.github.tanghuibo.activitistudy.request.TaskQueryParam;
import io.github.tanghuibo.activitistudy.utils.ToStringUtils;

import javax.annotation.Resource;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author tanghuibo
 * @date 2020/3/26上午12:19
 */
@SpringBootTest
public class ActivitiTest {

    @Resource
    ActivitiService activitiService;

    @Test
    public void deleteDeployTest() {
        activitiService.deleteByName("请假流程");
    }

    @Test
    public void deployTest() throws IOException {
        Deployment deployment = activitiService.deployByResourcePath("请假流程", "bpmn" + File.separator + "leave.bpmn");
        assert deployment != null;
    }

    @Test
    public void deployQueryTest() {
        DeploymentQueryParam param = new DeploymentQueryParam();
        param.setDeploymentName("请假流程");
        List<Deployment> deployments = activitiService.queryDeployment(param);
        assert deployments != null;
        assert deployments.size() == 1;
    }

    @Test
    public void startProcessInstanceById() {
        Map<String, Object> map = new HashMap<>();
        map.put("leader", "张三");
        map.put("vp", "李四");
        map.put("day", 5);
        ProcessInstance processInstance
                = activitiService.startProcessInstanceByKey(
                        "leave_v01", "testBusinessKey", map);
        System.out.println(processInstance);
    }

    @Test
    public void queryTask() {
        TaskQueryParam param = new TaskQueryParam();
        param.setAssignee("张三");
        List<Task> taskList = activitiService.queryTask(param);
        assert taskList.size() > 0;
        System.out.println(taskList.stream().map(ToStringUtils::toString).collect(Collectors.joining("\r\n")));
    }

    @Test
    public void complete() {
        TaskQueryParam param = new TaskQueryParam();
        param.setAssignee("李四");
        List<Task> taskList = activitiService.queryTask(param);
        taskList.forEach(task -> activitiService.complete(task.getId()));
    }

}
