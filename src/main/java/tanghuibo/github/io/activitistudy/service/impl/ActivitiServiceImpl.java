package tanghuibo.github.io.activitistudy.service.impl;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tanghuibo.github.io.activitistudy.entity.TaskQueryParam;
import tanghuibo.github.io.activitistudy.service.ActivitiService;
import tanghuibo.github.io.activitistudy.utils.ToStringUtils;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author tanghuibo
 * @date 2020/3/26上午12:39
 */
@Service
public class ActivitiServiceImpl implements ActivitiService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    RepositoryService repositoryService;

    @Resource
    RuntimeService runtimeService;

    @Resource
    TaskService taskService;

    @Override
    public Deployment deployByResourcePath(String name, String resourcePath) throws IOException {
        return repositoryService.createDeployment().addClasspathResource(resourcePath).name(name).deploy();
    }

    @Override
    public Deployment deployByStream(String name, InputStream inputStream) {
        Deployment deployment = repositoryService.createDeployment()
                .addInputStream(name + ".bpmn", inputStream)
                .name(name).deploy();
        logger.info("创建流程定义:" + ToStringUtils.toString(deployment));
        return deployment;
    }

    @Override
    public void deleteByName(String name) {
        getDeployByName(name)
                .forEach(item -> {
                    repositoryService.deleteDeployment(item.getId());
                    logger.info("删除流程定义:" + ToStringUtils.toString(item));
                });
    }

    @Override
    public List<Deployment> getDeployByName(String name) {
        return repositoryService.createDeploymentQuery().deploymentName(name).list();
    }

    @Override
    public ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey, Map<String, Object> map) {
        return runtimeService.startProcessInstanceByKey(processDefinitionKey, businessKey, map);
    }

    @Override
    public List<Task> queryTask(TaskQueryParam param) {
        String assignee = param.getAssignee();
        String candidateUser = param.getCandidateUser();
        TaskQuery taskQuery = taskService.createTaskQuery();
        if(!StringUtils.isEmpty(assignee)) {
            taskQuery.taskAssignee(assignee);
        }
        if(!StringUtils.isEmpty(candidateUser)) {
            taskQuery.taskCandidateUser(candidateUser);
        }
        return taskQuery.list();
    }
}
