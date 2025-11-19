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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Lob
    @Column(columnDefinition = ("LONGTEXT"))
    private String profileimage;

    @Lob
    @Column(columnDefinition = ("LONGTEXT"))
    private String commentText;
    private String timestamp;
    private int ids;

}
