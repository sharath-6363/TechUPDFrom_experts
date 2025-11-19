package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Reposiory.AdminLoginrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AdminLogin {
    @Autowired
    public AdminLoginrepo adrepo;

    @PostMapping("/adminlog")
    public ResponseEntity<?> adminlog(@RequestBody com.example.TechnologyUbyE.Entity.AdminLogin obj) {
        var Adinlogin = adrepo.findById(obj.getAdemail()).orElseThrow(() -> new RuntimeException("user not found"));
        if (Adinlogin.getAdpassword().equals(obj.getAdpassword())) {
            return new ResponseEntity<>("Adinlogin", HttpStatus.OK);
        } else {
            throw new RuntimeException("Invalid password");
        }

    }
}
