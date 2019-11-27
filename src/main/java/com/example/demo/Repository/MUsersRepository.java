package com.example.demo.Repository;

import com.example.demo.model.MUsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface MUsersRepository extends JpaRepository<MUsersEntity, Integer> {}
