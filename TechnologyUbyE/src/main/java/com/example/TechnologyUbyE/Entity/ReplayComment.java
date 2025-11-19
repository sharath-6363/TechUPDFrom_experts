package com.example.TechnologyUbyE.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReplayComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cid;
    private String username;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String profileimage;
    private String commenttext;
    private String timestamp;
    private int ids;


}
