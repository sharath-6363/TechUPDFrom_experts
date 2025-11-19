package com.example.TechnologyUbyE.Reposiory;

import com.example.TechnologyUbyE.Entity.TechUpdates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechUpdateRepo extends JpaRepository<TechUpdates, Integer> {

}
