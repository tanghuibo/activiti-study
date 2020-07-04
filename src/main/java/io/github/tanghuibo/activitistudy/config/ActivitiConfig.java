package io.github.tanghuibo.activitistudy.config;

import org.activiti.engine.*;
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

    @Bean
    public TaskService getTaskService(ProcessEngine processEngine) {
        return processEngine.getTaskService();
    }

    @Bean
    public HistoryService getHistoryService(ProcessEngine processEngine) {
        return processEngine.getHistoryService();
    }

    @Bean
    public ManagementService getManagementService(ProcessEngine processEngine) {
        return processEngine.getManagementService();
    }

    @Bean
    public RepositoryService getRepositoryService(ProcessEngine processEngine) {
        return processEngine.getRepositoryService();
    }

    @Bean
    public RuntimeService getRuntimeService(ProcessEngine processEngine) {
        return processEngine.getRuntimeService();
    }

    @Bean
    public DynamicBpmnService getDynamicBpmnService(ProcessEngine processEngine) {
        return processEngine.getDynamicBpmnService();
    }
}
