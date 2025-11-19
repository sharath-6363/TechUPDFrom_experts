package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Entity.TechAdd;
import com.example.TechnologyUbyE.Reposiory.AddTechrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class AddTech {
    @Autowired

    private AddTechrepo Arepo;

    @PostMapping("/Addtechs")
    public String postMethodName(@RequestBody TechAdd entity) {
        Arepo.save(entity);
        return "save";
    }

    @GetMapping("/getprofile/{email}")
    public String getprof(@PathVariable String email) {
        return Arepo.findProfByEmail(email);
    }

    @GetMapping("/getAddtech")
    public List<TechAdd> getAddtech() {
        return Arepo.findAll();
    }

    @PutMapping("putupdate/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody TechAdd entity) {
        Arepo.save(entity);
        return "puted";
    }
}
