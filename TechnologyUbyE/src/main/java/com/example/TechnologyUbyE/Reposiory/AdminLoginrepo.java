package com.example.TechnologyUbyE.Reposiory;

import com.example.TechnologyUbyE.Entity.AdminLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLoginrepo extends JpaRepository<AdminLogin, String> {


}
