package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Entity.Comment;
import com.example.TechnologyUbyE.Reposiory.CommentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CommentController {

    private final CommentRepository commentService;

    
    public CommentController(CommentRepository commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/getcomments")
    public List<Comment> getAllComments() {
        return commentService.findAll();
    }

    @PostMapping("/postcoments")
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.save(comment);
    }
    @DeleteMapping("/deletcomment/{id}")
    public String deletcommment(@PathVariable long id ) {
    	commentService.deleteById(id);
    	return "deleted";
    }

}
