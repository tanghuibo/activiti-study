package tanghuibo.github.io.activitistudy.service;

import org.activiti.engine.repository.Deployment;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
}
