package com.houssem.produitt.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houssem.produitt.entities.Produitt;

public interface ProduittRepository extends JpaRepository<Produitt, Long> {

}
