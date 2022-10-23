package com.aziz.animals.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aziz.animals.entities.Groupe;


@Repository
public interface GrpRepository extends JpaRepository<Groupe, Long>{

}