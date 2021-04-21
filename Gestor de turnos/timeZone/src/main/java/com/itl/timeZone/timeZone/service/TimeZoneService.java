package com.itl.timeZone.timeZone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.itl.gestor.models.FranjaHoraria;
import com.itl.timeZone.timeZone.dao.TimeZoneDao;

@ComponentScan({ "com.itl.*" })
@Service
public class TimeZoneService {

	@Autowired
	TimeZoneDao timeZoneDaoImpl;

	public List<FranjaHoraria> getAllTimeZone() {	
		return timeZoneDaoImpl.findAll();
	}
	
	public List<FranjaHoraria> getAllTimeZoneByDesdeYHasta(FranjaHoraria franja) {	
	
		return timeZoneDaoImpl.findAllByDesdeAndHasta(franja.getDesde(), franja.getHasta());
		
	}
	
}
