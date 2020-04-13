package tanghuibo.github.io.activitistudy.container;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.web.bind.annotation.*;
import tanghuibo.github.io.activitistudy.entity.*;
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

    @PostMapping("deleteDeploymentById")
    public Boolean deleteDeploymentById(@RequestBody DeploymentDeleteParam param) {
        return activitiService.deleteDeploymentById(param);
    }

    @PostMapping("addDeployment")
    public DeploymentDTO addDeployment(@RequestBody DeploymentAddParam param) {
        return convertToDTO(activitiService.addDeployment(param));
    }

    @PostMapping("startProcessInstance")
    public ProcessInstanceDTO startProcessInstance(@RequestBody DeploymentTaskParam param) {
        return convertToDTO(activitiService.startProcessInstance(param));
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

    private ProcessInstanceDTO convertToDTO(ProcessInstance processInstance) {
        ProcessInstanceDTO dto = new ProcessInstanceDTO();
        dto.setProcessDefinitionId(processInstance.getProcessDefinitionId());
        dto.setProcessDefinitionName(processInstance.getProcessDefinitionName());
        dto.setProcessDefinitionKey(processInstance.getProcessDefinitionKey());
        dto.setProcessDefinitionVersion(processInstance.getProcessDefinitionVersion());
        dto.setDeploymentId(processInstance.getDeploymentId());
        dto.setBusinessKey(processInstance.getBusinessKey());
        dto.setProcessVariables(processInstance.getProcessVariables());
        dto.setTenantId(processInstance.getTenantId());
        dto.setName(processInstance.getName());
        dto.setDescription(processInstance.getDescription());
        dto.setLocalizedName(processInstance.getLocalizedName());
        dto.setLocalizedDescription(processInstance.getLocalizedDescription());
        dto.setStartTime(processInstance.getStartTime());
        dto.setSuspended(processInstance.isSuspended());
        dto.setStartUserId(processInstance.getStartUserId());
        dto.setAppVersion(processInstance.getAppVersion());
        return dto;


    }
}
