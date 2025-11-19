package com.example.TechnologyUbyE.Entity;

import jakarta.annotation.ManagedBean;
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
public class AdminLogin {
    @Id
    private String Ademail;
    private String Adpassword;

}