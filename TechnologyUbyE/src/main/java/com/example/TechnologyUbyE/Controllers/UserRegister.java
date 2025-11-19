package com.example.TechnologyUbyE.Controllers;

import com.example.TechnologyUbyE.Entity.Userregster;
import com.example.TechnologyUbyE.Reposiory.UregisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
public class UserRegister {
        @Autowired
        private UregisterRepo urepo;
        @PostMapping("/PostRegister")
        public String postregister(@RequestBody Userregster obj) {
            urepo.save(obj);
            return "saved";
        }
        @PostMapping("/loginuser")
        public ResponseEntity<?> loginuser(@RequestBody Userregster obj) {
            var Userlogin = urepo.findById(obj.getUemail()).orElseThrow(() -> new RuntimeException("user not found"));
            if (Userlogin.getUpassword().equals(obj.getUpassword())) {
                return new ResponseEntity<>(Userlogin, HttpStatus.OK);
            } else {
                throw new RuntimeException("Invalid password");
            }
        }

        @PutMapping("putUdata/{id}")
        public String putMudataName(@PathVariable String id, @RequestBody Userregster entity) {
            urepo.save(entity);
            return "puted";
        }
        @GetMapping("/getudata")
        public List<Userregster> getudata() {
            return urepo.findAll();
        }

    }
