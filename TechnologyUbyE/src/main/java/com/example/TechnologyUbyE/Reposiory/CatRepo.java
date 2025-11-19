package com.example.TechnologyUbyE.Reposiory;

import com.example.TechnologyUbyE.Entity.UpdateCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CatRepo extends JpaRepository<UpdateCategory,Integer>{

}
