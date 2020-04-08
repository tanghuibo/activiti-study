package tanghuibo.github.io.activitistudy.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tanghuibo
 * @date 2020/4/3上午12:18
 */
public class DeploymentDTO implements Serializable {

    private String id;

    private String name;

    private Date deploymentTime;

    private String category;

    private String key;

    private String tenantId;

    private Integer version;

    private String projectReleaseVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeploymentTime() {
        return deploymentTime;
    }

    public void setDeploymentTime(Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getProjectReleaseVersion() {
        return projectReleaseVersion;
    }

    public void setProjectReleaseVersion(String projectReleaseVersion) {
        this.projectReleaseVersion = projectReleaseVersion;
    }
}
