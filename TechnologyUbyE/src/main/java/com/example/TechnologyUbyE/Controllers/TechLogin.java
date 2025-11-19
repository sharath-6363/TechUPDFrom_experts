package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Entity.TechAdd;
import com.example.TechnologyUbyE.Reposiory.AddTechrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class TechLogin {
    @Autowired

    private AddTechrepo Arepo;
    @PostMapping("/logintech")
    public ResponseEntity<?> logintech(@RequestBody TechAdd obj) {
        var Techlogin = Arepo.findById(obj.getAemail()).orElseThrow(() -> new RuntimeException("user not found"));
        if (Techlogin.getApassword().equals(obj.getApassword())) {
            return new ResponseEntity<>(Techlogin, HttpStatus.OK);
        } else {
            throw new RuntimeException("Invalid password");
        }
    }
}
