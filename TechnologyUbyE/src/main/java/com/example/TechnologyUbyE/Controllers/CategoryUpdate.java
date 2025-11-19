package com.example.TechnologyUbyE.Controllers;


import com.example.TechnologyUbyE.Entity.UpdateCategory;
import com.example.TechnologyUbyE.Reposiory.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CategoryUpdate {
    @Autowired

    public CatRepo crepo;

    @PostMapping("/updCate")
    public String pathcat(@RequestBody UpdateCategory entity) {
        crepo.save(entity);

        return "saved";
    }

    @GetMapping("/getcategory")
    public List<UpdateCategory> getcategor() {
        return crepo.findAll();
    }

    @DeleteMapping("/deletecat/{id}")
    public String deletecat(@PathVariable int id) {
        crepo.deleteById(id);
        return "deleted";
    }

}
