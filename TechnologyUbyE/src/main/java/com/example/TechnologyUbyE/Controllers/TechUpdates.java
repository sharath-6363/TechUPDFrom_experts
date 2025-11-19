package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Reposiory.TechUpdateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
public class TechUpdates {

    @Autowired
    private TechUpdateRepo UPDrepo;

    @PostMapping("/AddUpd")
    public String postMethodName(@RequestBody com.example.TechnologyUbyE.Entity.TechUpdates entity) {
        UPDrepo.save(entity);
        return "save";
    }
    @GetMapping("/gettechUpd")
    public List<com.example.TechnologyUbyE.Entity.TechUpdates> getAddtech() {
        return UPDrepo.findAll();
    }

    @PutMapping("putUpdate/{id}")
    public String putMethodName( @RequestBody com.example.TechnologyUbyE.Entity.TechUpdates entity) {
        UPDrepo.save(entity);
        return "puted";
    }
    @DeleteMapping("/deleteupd/{id}")
    public  String deletedata(@PathVariable int id){
        UPDrepo.deleteById(id);
        return "Deleted";
    }
}


