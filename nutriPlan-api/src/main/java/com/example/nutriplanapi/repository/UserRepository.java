package com.example.nutriplanapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nutriplanapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
