package com.example.TechnologyUbyE.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TechAdd {
        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private int id;
        private String Aemail;
        private String Aname;
        private String Apassword;
        private String Expertise;
        @Lob
        @Column(columnDefinition = "LONGTEXT")
        private String imageprof;

}
