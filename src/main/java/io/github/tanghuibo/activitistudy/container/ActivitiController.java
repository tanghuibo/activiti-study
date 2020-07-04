package io.github.tanghuibo.activitistudy.container;

import io.github.tanghuibo.activitistudy.entity.*;
import io.github.tanghuibo.activitistudy.request.*;
import io.github.tanghuibo.activitistudy.service.ActivitiService;
import io.github.tanghuibo.activitistudy.utils.ConvertTool;
import org.springframework.web.bind.annotation.*;

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
        return activitiService.queryDeployment(param).stream().map(ConvertTool::convertToDTO).collect(Collectors.toList());
    }

    @GetMapping("queryProcessDefinition")
    public List<ProcessDefinitionDTO> queryProcessDefinition(ProcessDefinitionQueryParam param) {
        return activitiService.queryProcessDefinition(param).stream().map(ConvertTool::convertToDTO).collect(Collectors.toList());
    }

    @PostMapping("deleteDeploymentById")
    public Boolean deleteDeploymentById(@RequestBody DeploymentDeleteParam param) {
        return activitiService.deleteDeploymentById(param);
    }

    @PostMapping("addDeployment")
    public DeploymentDTO addDeployment(@RequestBody DeploymentAddParam param) {
        return ConvertTool.convertToDTO(activitiService.addDeployment(param));
    }

    @PostMapping("startProcessInstance")
    public ProcessInstanceDTO startProcessInstance(@RequestBody DeploymentTaskParam param) {
        return ConvertTool.convertToDTO(activitiService.startProcessInstance(param));
    }
}
