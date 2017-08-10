package zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import zuul.filter.PreRequestFilter;

@SpringCloudApplication//主要需要@SpringBootApplication @EnableDiscoveryClient  @EnableCircuitBreaker 这三个注解
@EnableZuulProxy//启动zuul
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	@Bean
	public PreRequestFilter preRequestFilter() {
		return new PreRequestFilter();

	}
}
