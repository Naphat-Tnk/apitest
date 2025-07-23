package com.example.apitest.Repository;

import com.example.apitest.Entity.SsoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SsoUserRepo extends JpaRepository<SsoUser, Long> {
}
