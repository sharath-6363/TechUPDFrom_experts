package com.example.TechnologyUbyE.Reposiory;

import com.example.TechnologyUbyE.Entity.Userregster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UregisterRepo extends JpaRepository<Userregster, String> {

}
