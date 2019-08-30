# spring-cloud-test
主要参考了 https://github.com/ityouknow/spring-cloud-examples ，一些具体信息见上面这里
### eureka server（s1, s2）  
### eureka client(client-a,b,c)
### hystrix and dashboard 
1. 熔断，类似于catch捕获异常并给予默认值
2. 熔断监控面板 ，需要在client中引入相关包 ，并进行相应的url开放配置 
### git server single
需要在client中配置bootstrap.yml和相应的git server，同时开放相应url才可以访问，貌似配置中的端口 refresh无法更改   ，需要真实重启 
目前client-b client-c gateway  hystrix-dashboard 通过git获取
bus 搭建暂为实现
### gateway 

### zipkin 
SpringBoot 2.x 好像建议单独搭建server 见zipkin文件夹
对应的client需要引入相应的jar包即可

## NOTE
SpringBoot 2.x 相当于 SpringBoot 1.x 有了一些变化，一些jar包的名称发生改变， 原本的一些监控或管理链接需要在前面加上 actuator  
对于包管理不好的话，可以参考https://start.spring.io/ 直接生成引用包的pom文件
