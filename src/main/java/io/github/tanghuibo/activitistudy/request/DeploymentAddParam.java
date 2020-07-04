package io.github.tanghuibo.activitistudy.request;

/**
 * @author tanghuibo
 * @date 2020/4/7上午12:04
 */
public class DeploymentAddParam {

    /**
     * 名称
     */
    private String name;

    /**
     * 内容
     */
    private String bpmnXml;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBpmnXml() {
        return bpmnXml;
    }

    public void setBpmnXml(String bpmnXml) {
        this.bpmnXml = bpmnXml;
    }
}
