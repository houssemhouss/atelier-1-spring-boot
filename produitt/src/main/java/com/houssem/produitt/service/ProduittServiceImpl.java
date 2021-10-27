package com.houssem.produitt.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssem.produitt.entities.Produitt;
import com.houssem.produitt.repos.ProduittRepository;
@Service
public class ProduittServiceImpl implements ProudittService{
	private ProduittRepository produittRepository;

	@Autowired
	ProduittRepository produitRepository;
	@Override
	public Produitt saveProduit(Produitt p) {
	return produittRepository.save(p);
	}
	
	@Override
	public Produitt updateProduit(Produitt p) {
	return produitRepository.save(p);
	}
	@Override
	public void deleteProduit(Produitt p) {
	produitRepository.delete(p);
	}
	@Override
	public void deleteProduitById(Long id) {
	produitRepository.deleteById(id);
	}
	@Override
	public Produitt getProduit(Long id) {
	return produitRepository.findById(id).get();
	}
	@Override
	public List<Produitt> getAllProduits() {
	return produitRepository.findAll();
	}
}
