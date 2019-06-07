package com.todomascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todomascotas.entity.TipoCanal;

@Repository
public interface TipoCanalRepository extends JpaRepository<TipoCanal, Integer>{

}
