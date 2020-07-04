package io.github.tanghuibo.activitistudy.request;

import java.io.Serializable;

/**
 * @author tanghuibo
 * @date 2020/4/3上午12:11
 */
public class DeploymentQueryParam implements Serializable {

    /**
     * 部署名称
     */
    private String deploymentName;

    public String getDeploymentName() {
        return deploymentName;
    }

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }
}
