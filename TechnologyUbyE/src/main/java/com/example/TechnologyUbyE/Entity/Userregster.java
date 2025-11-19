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
public class Userregster {
    @Id
    private String uemail;
    private String uname;
    private String upassword;
    private String agreeTerms;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String image;

}
