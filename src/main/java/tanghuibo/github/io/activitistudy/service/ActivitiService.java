package tanghuibo.github.io.activitistudy.service;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import tanghuibo.github.io.activitistudy.entity.DeploymentAddParam;
import tanghuibo.github.io.activitistudy.entity.DeploymentDeleteParam;
import tanghuibo.github.io.activitistudy.entity.DeploymentQueryParam;
import tanghuibo.github.io.activitistudy.entity.TaskQueryParam;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author tanghuibo
 * @date 2020/3/26上午12:38
 */
public interface ActivitiService {

    /**
     * 通过ResourcesPath发布
     * @param name
     * @param resourcePath
     */
    Deployment deployByResourcePath(String name, String resourcePath) throws IOException;

    /**
     * 通过inputStream发布
     * @param name
     * @param inputStream
     */
    Deployment deployByStream(String name, InputStream inputStream) throws IOException;

    /**
     * 通过名称删除
     * @param name
     */
    void deleteByName(String name);

    /**
     * 通过名称查询
     * @param param
     */
    List<Deployment> queryDeployment(DeploymentQueryParam param);

    /**
     * 创建一个新流程
     * @param processDefinitionKey
     * @param businessKey
     * @param map
     * @return
     */
    ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey, Map<String, Object> map);

    /**
     * 创建一个新流程
     * @param processDefinitionId
     * @param businessKey
     * @param map
     * @return
     */
    ProcessInstance startProcessInstanceById(String processDefinitionId, String businessKey, Map<String, Object> map);

    /**
     * 查询任务
     * @param param
     * @return
     */
    List<Task> queryTask(TaskQueryParam param);

    /**
     * 完成任务
     * @param taskId
     */
    void complete(String taskId);

    /**
     * 删除流程定义
     * @param param
     * @return
     */
    Boolean deleteDeploymentById(DeploymentDeleteParam param);

    /**
     * 新增工作流
     * @param param
     * @return
     */
    Deployment addDeployment(DeploymentAddParam param);
}
