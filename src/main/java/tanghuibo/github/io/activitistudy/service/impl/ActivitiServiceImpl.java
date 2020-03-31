package tanghuibo.github.io.activitistudy.service.impl;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import tanghuibo.github.io.activitistudy.service.ActivitiService;
import tanghuibo.github.io.activitistudy.utils.ToStringUtils;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author tanghuibo
 * @date 2020/3/26上午12:39
 */
@Service
public class ActivitiServiceImpl implements ActivitiService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    RepositoryService repositoryService;

    @Override
    public Deployment deployByResourcePath(String name, String resourcePath) throws IOException {
        try(InputStream inputStream = new ClassPathResource(resourcePath).getInputStream();){
           return deployByStream(name, inputStream);
        }
    }

    @Override
    public Deployment deployByStream(String name, InputStream inputStream) {
        Deployment deployment = repositoryService.createDeployment()
                .addInputStream("leave.xml", inputStream)
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
}
