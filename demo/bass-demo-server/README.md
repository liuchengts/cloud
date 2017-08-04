server
---------------------------
demo项目的server层

### 说明

* dubbo  dubbo服务实现
* manager  声明需要的feign服务及熔断器的处理
* repository  model类操作jpa层
* rest  http服务声明，供其他feign或使用http方式的调用服务，服务实现强制要求只能调用service层
* service  业务操作层，所有的业务必须在这里完成，manager层接口调用必须在这里
