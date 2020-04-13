package tanghuibo.github.io.activitistudy.entity;

import java.io.Serializable;

/**
 * @author tanghuibo
 * @date 2020/4/13下午9:36
 */
public class ProcessDefinitionQueryParam implements Serializable {
    /**
     * 流程定义名称
     */
    private String processDefinitionName;


    public String getProcessDefinitionName() {
        return processDefinitionName;
    }

    public void setProcessDefinitionName(String processDefinitionName) {
        this.processDefinitionName = processDefinitionName;
    }
}
