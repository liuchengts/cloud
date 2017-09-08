package server;
import com.bass.support.BassSupportApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({"common.model"})
@EnableJpaRepositories({"core.repository"})
public class BassDemoServerApplication extends BassSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(BassDemoServerApplication.class, args);
    }
}
