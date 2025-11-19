package com.example.TechnologyUbyE.Reposiory;

import java.util.List;

import com.example.TechnologyUbyE.Entity.ReplayComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReplayRepo extends JpaRepository<ReplayComment, Long> {
    @Query("SELECT r FROM ReplayComment r WHERE r.cid = :cid")
    List<ReplayComment> findByCid(@Param("cid") long cid);
}
