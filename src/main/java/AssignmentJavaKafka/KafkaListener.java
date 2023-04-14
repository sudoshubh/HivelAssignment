package AssignmentJavaKafka;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener
            (
            topics = "Topic_Test",
            groupId = "groupId"
    )
     void listener(String data){
        System.out.println("Listener received: "+ data + " ");
    }

}
