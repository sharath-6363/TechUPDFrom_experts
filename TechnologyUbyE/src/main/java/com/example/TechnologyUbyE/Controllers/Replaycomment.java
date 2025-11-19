package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Entity.ReplayComment;
import com.example.TechnologyUbyE.Reposiory.ReplayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
public class Replaycomment {
    @Autowired
    public ReplayRepo replayrepo;

    @PostMapping("/replaypost")
    public String getreplays(@RequestBody ReplayComment obj) {
        replayrepo.save(obj);
        return "saved";
    }

    @DeleteMapping("/deletreplay/{id}")
    public  String deletereply(@PathVariable long id ){
        replayrepo.deleteById(id);
        return "deleted";
    }

    @GetMapping("/getreplaycom/{cid}")
    public List<ReplayComment> postreplaycomment(@PathVariable long cid) {
        return replayrepo.findByCid(cid);
    }
}

