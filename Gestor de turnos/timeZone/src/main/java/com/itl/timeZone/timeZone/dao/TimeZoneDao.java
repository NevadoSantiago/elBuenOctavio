package com.itl.timeZone.timeZone.dao;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itl.gestor.models.FranjaHoraria;

@Repository
@ComponentScan({ "com.itl.*" })
public interface TimeZoneDao extends JpaRepository<FranjaHoraria, Integer> {
	
	
	List<FranjaHoraria> findAllByDesdeAndHasta(String from, String to);

}
