package tanghuibo.github.io.activitistudy.entity;

/**
 * @author tanghuibo
 * @date 2020/4/15下午10:43
 */
public class ProcessDefinitionDTO {

    /** unique identifier */
    private String id;

    /**
     * category name which is derived from the tarNamespace attribute in the definitions element
     */
    private String category;

    /** label used for display purposes */
    private String name;

    /** unique name for all versions this process definitions */
    private String key;

    /** description of this process **/
    String description;

    /** version of this process definition */
    private Integer version;

    private String resourceName;

    /** The deployment in which this process definition is contained. */
    private String deploymentId;

    /** The resource name in the deployment of the diagram image (if any). */
    String diagramResourceName;


    private  Boolean hasStartFormKey;

    /**
     * Does this process definition has a graphical notation defined (such that a diagram can be generated)?
     */
    private Boolean hasGraphicalNotation;

    /** Returns true if the process definition is in suspended state. */
    private Boolean suspended;

    /** The tenant identifier of this process definition */
    private String tenantId;

    /** The engine version for this process definition (5 or 6) */
    private String engineVersion;

    private Integer appVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getDiagramResourceName() {
        return diagramResourceName;
    }

    public void setDiagramResourceName(String diagramResourceName) {
        this.diagramResourceName = diagramResourceName;
    }

    public Boolean getHasStartFormKey() {
        return hasStartFormKey;
    }

    public void setHasStartFormKey(Boolean hasStartFormKey) {
        this.hasStartFormKey = hasStartFormKey;
    }

    public Boolean getHasGraphicalNotation() {
        return hasGraphicalNotation;
    }

    public void setHasGraphicalNotation(Boolean hasGraphicalNotation) {
        this.hasGraphicalNotation = hasGraphicalNotation;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }
}
