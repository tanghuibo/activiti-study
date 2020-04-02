package tanghuibo.github.io.activitistudy.container;

import org.activiti.engine.repository.Deployment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tanghuibo.github.io.activitistudy.entity.DeploymentDTO;
import tanghuibo.github.io.activitistudy.entity.DeploymentQueryParam;
import tanghuibo.github.io.activitistudy.service.ActivitiService;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tanghuibo
 * @date 2020/4/3上午12:07
 */
@RestController
@RequestMapping("activiti")
public class ActivitiController {

    @Resource
    ActivitiService activitiService;

    @GetMapping("queryDeployment")
    public List<DeploymentDTO> queryDeployment(DeploymentQueryParam param) {
        return activitiService.queryDeployment(param).stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private DeploymentDTO convertToDTO(Deployment deployment) {
        DeploymentDTO dto = new DeploymentDTO();
        dto.setId(deployment.getId());
        dto.setName(deployment.getName());
        dto.setDeploymentTime(deployment.getDeploymentTime());
        dto.setCategory(deployment.getCategory());
        dto.setKey(deployment.getKey());
        dto.setTenantId(deployment.getTenantId());
        dto.setVersion(deployment.getVersion());
        dto.setProjectReleaseVersion(deployment.getProjectReleaseVersion());
        return dto;
    }
}
