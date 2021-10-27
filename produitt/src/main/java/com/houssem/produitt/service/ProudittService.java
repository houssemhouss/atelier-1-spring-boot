package com.houssem.produitt.service;

import java.util.List;

import com.houssem.produitt.entities.Produitt;

public interface ProudittService  {
	Produitt saveProduit(Produitt p);
	Produitt updateProduit(Produitt p);
	void deleteProduit(Produitt p);
	void deleteProduitById(Long id);
	Produitt getProduit(Long id);
	List<Produitt> getAllProduits();
	}


