package io.github.ruvesh.springboot3demos.observability;

import io.github.ruvesh.springboot3demos.observability.post.model.Post;
import io.github.ruvesh.springboot3demos.observability.post.service.JsonPlaceholderService;
import io.micrometer.observation.annotation.Observed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * A simple dummy method that runs in command line to log the count of posts loaded, soon
	 * after the application starts to demonstrate the following: <br/> <br/>
	 * Adding observability to custom logic/code/methods and not just the spring managed beans like RestControllers and
	 * Services. A real-world application could be observing a method that loads some remote cache. <br/>
	 * For this, we need to spring-aop to classpath and use the Observed aspect. <br/> <br/>
	 *
	 * {@link io.micrometer.observation.annotation.Observed @Observed}
	 * @see <a href="https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-aop">
	 *     		spring-boot-starter-aop
	 *     	</a>
	 */
	@Bean
	@Observed(name = "post.load-cache", contextualName = "post.load-cache")
	CommandLineRunner commandLineRunner(JsonPlaceholderService jsonPlaceholderService){
		return args -> {
			List<Post> posts = jsonPlaceholderService.findAll();
			log.info("Posts {}", posts.size());
		};
	}

}
