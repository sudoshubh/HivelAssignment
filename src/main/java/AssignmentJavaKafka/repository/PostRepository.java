package AssignmentJavaKafka.repository;

import AssignmentJavaKafka.mdb.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
