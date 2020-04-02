package tanghuibo.github.io.activitistudy.utils;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.task.Task;

/**
 * @author tanghuibo
 * @date 2020/3/26上午1:10
 */
public class ToStringUtils {

    public static String toString(Deployment deployment) {
        return String.format("id: %s; name: %s, key: %s", deployment.getId(), deployment.getName(), deployment.getKey());
    }

    public static String toString(Task task) {
        return String.format("id: %s; processDefinitionId: %s; name: %s; assignee: %s", task.getId(), task.getProcessDefinitionId(), task.getName(), task.getAssignee());
    }
}
