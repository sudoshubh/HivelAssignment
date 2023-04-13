package AssignmentJavaKafka.mdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@ToString
@Document(collection = "TestCollection")
public class Post {
    private String profile;
    private String desc;
    private String exp;
    private String techs[];
}
