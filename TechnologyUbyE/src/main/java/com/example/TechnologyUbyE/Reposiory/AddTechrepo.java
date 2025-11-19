package com.example.TechnologyUbyE.Reposiory;

import com.example.TechnologyUbyE.Entity.TechAdd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddTechrepo extends JpaRepository<TechAdd, String> {

    @Query("SELECT a.imageprof FROM TechAdd a WHERE a.Aname = :email")
    String findProfByEmail(@Param("email") String email);

}
