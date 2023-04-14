package AssignmentJavaKafka.repository;

import AssignmentJavaKafka.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
