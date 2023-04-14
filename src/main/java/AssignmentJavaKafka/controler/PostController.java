package AssignmentJavaKafka.controler;

import AssignmentJavaKafka.model.Post;
import AssignmentJavaKafka.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return postRepository.save(post);
    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@RequestBody Post post){
        postRepository.delete(post);
    }
}
