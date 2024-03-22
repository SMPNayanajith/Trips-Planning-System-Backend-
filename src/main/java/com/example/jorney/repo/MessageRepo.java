package com.example.jorney.repo;


import com.example.jorney.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MessageRepo extends JpaRepository<Message,Long> {
}
