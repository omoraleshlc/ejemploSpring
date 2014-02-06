package com.sshlc.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.sshlc.org.dao.AlumnosDao;
import com.sshlc.org.domain.Alumnos;


public class AlumnosServiceImpl implements AlumnosService {

	@Autowired
	AlumnosDao alumnosdao;

	@Override
	public void insertData(Alumnos alumnos) {
		alumnosdao.insertData(alumnos);
	}

	@Override
	public List<Alumnos> getAlumnosList() {
		return alumnosdao.getAlumnosList();
	}

	@Override
	public void deleteData(Integer keyAEMain) {
		alumnosdao.deleteData(keyAEMain);
		
	}

	@Override
	public Alumnos getAlumnos(Integer keyAEMain) {
		return alumnosdao.getAlumnos(keyAEMain);
	}

	@Override
	public void updateData(Alumnos alumnos) {
		alumnosdao.updateData(alumnos);
		
	}


	
}
