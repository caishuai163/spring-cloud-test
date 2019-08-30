# 熔断监控 
1. 开启了从git server 获取配置信息
2. 注册到eureka 
3. 被监控需要开启`hystrix.stream` 新版本默认是被限制访问该url `/actuator/hystrix.stream`
4. 访问链接 http://localhost:22001/hystrix
