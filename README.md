# Dubbo-cloud-nacos
dubbo-cloud整合

1.2020.4.8 已整合cloud-dubbo的nacos服务发现，配置中心

2.2020.4.11 添加dubbo生产者，消费者（dubbo-cloud-provider、dubbo-cloud-consumer），cloud生产者，消费者（dubbo-cloud-openfeign-provider、dubbo-cloud-openfeign-consumer），其中dubbo-cloud-consumer可同时调用dubbo，cloud服务，cloud服务通过注解@DubboTransported(protocol = "dubbo")底层使用rpc

3.2020.4.13 添加rocketmq消息生产者rocketmqp

4.2020.4.21 添加aop注解

5.2020.4.23 添加rocketmc消息消费者rocketmqc，mq版本2.0.4