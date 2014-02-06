package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Alumnos;

public interface AlumnosService {
	public void insertData(Alumnos alumnos);

	public List<Alumnos> getAlumnosList();

	public void deleteData(String keyAEMain);

	public Alumnos getAlumnos(String keyAEMain);

	public void updateData(Alumnos alumnos);
}
