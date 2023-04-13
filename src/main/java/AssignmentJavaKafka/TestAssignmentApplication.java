package AssignmentJavaKafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@EnableMongoRepositories
public class TestAssignmentApplication  {

	@Autowired
	private KafkaTemplate<String, Object> template;
	private String topic ="shubham";

	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name ){
		template.send(topic,"Hi "+name+" This is test Topic from Kafka");
		return "Data published";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestAssignmentApplication.class, args);
	}

}
