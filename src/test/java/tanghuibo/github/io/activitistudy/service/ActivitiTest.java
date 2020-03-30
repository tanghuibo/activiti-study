package tanghuibo.github.io.activitistudy.service;
import org.activiti.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tanghuibo.github.io.activitistudy.ActivitiService;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;

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
}
