package tanghuibo.github.io.activitistudy.entity;

import java.util.Map;

/**
 * @author tanghuibo
 * @date 2020/4/8下午11:39
 */
public class DeploymentTaskParam {

    /**
     * 流程定义ID
     */
    private String processDefinitionId;

    /**
     * 业务key
     */
    private String businessKey;

    /**
     * 上下文
     */
    private Map<String, Object> context;

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public Map<String, Object> getContext() {
        return context;
    }

    public void setContext(Map<String, Object> context) {
        this.context = context;
    }
}
