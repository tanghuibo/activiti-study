# 实际使用

## BPMN 绘制

1. 安装插件 [actibpm](https://plugins.jetbrains.com/plugin/7429-actibpm/versions) 进行绘制

## activiti 日志配置

```yml
logging:
  level:
    root: info
    org.activiti.engine.impl.persistence.entity.PropertyEntityImpl: debug
```