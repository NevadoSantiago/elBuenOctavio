package com.itl.timeZone.timeZone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itl.gestor.models.FranjaHoraria;
import com.itl.timeZone.timeZone.service.TimeZoneService;

@ComponentScan({ "com.itl.*" })
@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class TimeZoneController {

	@Autowired
	TimeZoneService timeZoneService;
	
	@GetMapping("/get")
	public ResponseEntity<?> prueba(){
		
		 List<FranjaHoraria> franjaHoraria = timeZoneService.getAllTimeZone();
		
		try {
		return new ResponseEntity<List<FranjaHoraria>>(franjaHoraria,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<Boolean>(Boolean.FALSE,HttpStatus.CONFLICT);
		}
	}
	@GetMapping("/get2")
	public ResponseEntity<?> prueba2(
			@RequestBody FranjaHoraria franja
			){
		
		 List<FranjaHoraria> franjaHoraria = timeZoneService.getAllTimeZoneByDesdeYHasta(franja);
		
		try {
		return new ResponseEntity<List<FranjaHoraria>>(franjaHoraria,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<Boolean>(Boolean.FALSE,HttpStatus.CONFLICT);
		}
	}
	
	
}
