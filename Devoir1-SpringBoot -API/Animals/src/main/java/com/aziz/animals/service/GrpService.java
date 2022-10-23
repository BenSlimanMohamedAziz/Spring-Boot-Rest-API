package com.aziz.animals.service;

import java.util.List;

import com.aziz.animals.entities.Groupe;


public interface GrpService {

    List <Groupe> findAll();
    
    Groupe saveGroupe(Groupe g);
    Groupe updateGroupe(Groupe g);
    void deleteGroupe(Groupe g);
     void deleteGroupeById(Long id);
     Groupe getGroupe (Long idGrp);

}