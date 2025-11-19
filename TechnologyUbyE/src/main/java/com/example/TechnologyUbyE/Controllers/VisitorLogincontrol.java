package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Entity.Userregster;
import com.example.TechnologyUbyE.Reposiory.UregisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
public class VisitorLogincontrol {

        @Autowired
      public UregisterRepo Vrepo;
        @PostMapping("/loginvisitor")
        public ResponseEntity<?> loginvisitor(@RequestBody Userregster obj) {
            var Techlogin = Vrepo.findById(obj.getUemail()).orElseThrow(() -> new RuntimeException("user not found"));
            if (Techlogin.getUpassword().equals(obj.getUpassword())) {
                return new ResponseEntity<>(Techlogin, HttpStatus.OK);
            } else {
                throw new RuntimeException("Invalid password");
            }
        }
    }


