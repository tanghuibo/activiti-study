package tanghuibo.github.io.activitistudy.config;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tanghuibo
 * @date 2020/3/20上午12:20
 */
@Configuration
public class ActivitiConfig {

    @Bean
    public ProcessEngine buildProcessEngine() {
        return ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault().buildProcessEngine();
    }
}
