package com.example.VkOneToOne.Repo;

import com.example.VkOneToOne.Entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepo extends JpaRepository<Policy,Integer> {
}
