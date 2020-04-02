package tanghuibo.github.io.activitistudy.service;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
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
     * @param name
     */
    List<Deployment> getDeployByName(String name);

    /**
     * 创建一个新流程
     * @param processDefinitionKey
     * @param businessKey
     * @param map
     * @return
     */
    ProcessInstance startProcessInstanceByKey(String processDefinitionKey, String businessKey, Map<String, Object> map);

    /**
     * 查询任务
     * @return
     */
    List<Task> queryTask(TaskQueryParam param);
}
