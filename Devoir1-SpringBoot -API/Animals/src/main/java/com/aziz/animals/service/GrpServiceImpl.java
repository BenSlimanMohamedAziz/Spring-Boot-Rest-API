package com.aziz.animals.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.animals.entities.Groupe;
import com.aziz.animals.repos.GrpRepository;


@Service
public class GrpServiceImpl implements GrpService {

    @Autowired
    private GrpRepository grpRepository;

    @Override
    public List <Groupe> findAll() {
        return grpRepository.findAll();
    }

	@Override
	public Groupe saveGroupe(Groupe g) {
		return grpRepository.save(g);
	}

	@Override
	public Groupe updateGroupe(Groupe g) {
		return grpRepository.save(g);
	}

	@Override
	public void deleteGroupe(Groupe g) {
		grpRepository.delete(g);
	}

	@Override
	public void deleteGroupeById(Long idGrp) {
		grpRepository.deleteById(idGrp);
	}

	@Override
	public Groupe getGroupe(Long idGrp) {
		return grpRepository.findById(idGrp).get();
	}

   
}