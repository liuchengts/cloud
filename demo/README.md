demo
---------------------------
demo项目的微服务结构

### 说明

* common   model层
* cloud-support  cloud接口支持层
* dubbo-support  dubbo接口支持层
* core  数据操作层
* server  接口实现及kafka消息收发层
* web  web服务层

### 待处理
server 的设计不符合ddd思想，需要增加聚合服务来抽离server层


