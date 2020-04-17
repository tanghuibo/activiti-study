package tanghuibo.github.io.activitistudy.container;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.web.bind.annotation.*;
import tanghuibo.github.io.activitistudy.entity.*;
import tanghuibo.github.io.activitistudy.service.ActivitiService;
import tanghuibo.github.io.activitistudy.utils.ConvertTool;

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
