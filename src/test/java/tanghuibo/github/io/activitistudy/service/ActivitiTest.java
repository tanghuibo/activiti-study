package tanghuibo.github.io.activitistudy.service;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Deployment> deployments = activitiService.getDeployByName("请假流程");
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
}
