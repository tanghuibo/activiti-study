package tanghuibo.github.io.activitistudy.utils;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import tanghuibo.github.io.activitistudy.entity.DeploymentDTO;
import tanghuibo.github.io.activitistudy.entity.ProcessDefinitionDTO;
import tanghuibo.github.io.activitistudy.entity.ProcessInstanceDTO;

/**
 * @author tanghuibo
 * @date 2020/4/17下午11:44
 */
public class ConvertTool {

    public static ProcessDefinitionDTO convertToDTO(ProcessDefinition processDefinition) {
        ProcessDefinitionDTO processDefinitionDTO = new ProcessDefinitionDTO();
        processDefinitionDTO.setId(processDefinition.getId());
        processDefinitionDTO.setCategory(processDefinition.getCategory());
        processDefinitionDTO.setName(processDefinition.getName());
        processDefinitionDTO.setKey(processDefinition.getKey());
        processDefinitionDTO.setDescription(processDefinition.getDescription());
        processDefinitionDTO.setVersion(processDefinition.getVersion());
        processDefinitionDTO.setResourceName(processDefinition.getResourceName());
        processDefinitionDTO.setDeploymentId(processDefinition.getDeploymentId());
        processDefinitionDTO.setDiagramResourceName(processDefinition.getDiagramResourceName());
        processDefinitionDTO.setHasStartFormKey(processDefinition.hasStartFormKey());
        processDefinitionDTO.setHasGraphicalNotation(processDefinition.hasGraphicalNotation());
        processDefinitionDTO.setSuspended(processDefinition.isSuspended());
        processDefinitionDTO.setTenantId(processDefinition.getTenantId());
        processDefinitionDTO.setEngineVersion(processDefinition.getEngineVersion());
        processDefinitionDTO.setAppVersion(processDefinition.getAppVersion());
        return processDefinitionDTO;
    }

    public static DeploymentDTO convertToDTO(Deployment deployment) {
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

    public static ProcessInstanceDTO convertToDTO(ProcessInstance processInstance) {
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
