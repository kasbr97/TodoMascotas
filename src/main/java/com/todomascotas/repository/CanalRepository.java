package com.todomascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todomascotas.entity.Canal;
@Repository
public interface CanalRepository extends JpaRepository<Canal, Integer> {

}
