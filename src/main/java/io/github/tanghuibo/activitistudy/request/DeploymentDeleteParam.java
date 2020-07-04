package io.github.tanghuibo.activitistudy.request;

import java.io.Serializable;

/**
 * @author tanghuibo
 * @date 2020/4/6下午11:51
 */
public class DeploymentDeleteParam implements Serializable {

    /**
     * id
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
