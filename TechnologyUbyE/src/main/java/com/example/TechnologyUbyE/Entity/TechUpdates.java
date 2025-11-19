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
public class TechUpdates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String category;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String description;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String tag;
    private String names;
    private String emails;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String images;
}

