package com.example.TechnologyUbyE.Reposiory;
import com.example.TechnologyUbyE.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Add custom query methods if needed
}
