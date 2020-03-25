package tanghuibo.github.io.activitistudy.utils;

import org.activiti.engine.repository.Deployment;

/**
 * @author tanghuibo
 * @date 2020/3/26上午1:10
 */
public class ToStringUtils {

    public static String toString(Deployment deployment) {
        return String.format("ID: %s; name: %s", deployment.getId(), deployment.getName());
    }
}
