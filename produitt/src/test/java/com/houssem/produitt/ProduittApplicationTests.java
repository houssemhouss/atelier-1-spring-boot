package com.houssem.produitt;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.houssem.produitt.entities.Produitt;
import com.houssem.produitt.repos.ProduittRepository;

@SpringBootTest
class ProduittApplicationTests {

	@Autowired
	private ProduittRepository produittRepository;
	@Test
	public void testCreateProduitt() {
	Produitt prod = new Produitt("PC Dell",2200.500,new Date());
	produittRepository.save(prod);
	}
	
	
	@Test
	public void testFindProduit()
	{
	Produitt p = produittRepository.findById(1L).get();

	System.out.println(p);
	}
	
	
	@Test
	public void testUpdateProduit()
	{
	Produitt p = produittRepository.findById(3L).get();
	p.setPrixProduit(2011.0);
	produittRepository.save(p);
	}
	public void testDeleteProduit()
	{
	produittRepository.deleteById(3L);;
	}
	@Test
	public void testListerTousProduits()
	{
	List<Produitt> prods = produittRepository.findAll();
	for (Produitt p : prods)
	{
	System.out.println(p);
	}
	

	
	}
}


