package com.example.VkOneToOne.Repo;

import com.example.VkOneToOne.Entity.PersonEn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<PersonEn,Integer> {
}
