package tanghuibo.github.io.activitistudy.entity;

import java.io.Serializable;

/**
 * @author tanghuibo
 * @date 2020/4/2下午11:51
 */
public class TaskQueryParam implements Serializable {

    /**
     * 受让人
     */
    private String assignee;

    /**
     * 候选人
     */
    private String candidateUser;

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getCandidateUser() {
        return candidateUser;
    }

    public void setCandidateUser(String candidateUser) {
        this.candidateUser = candidateUser;
    }
}
