package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Alumnos;

public interface AlumnosService {
	public void insertData(Alumnos alumnos);

	public List<Alumnos> getAlumnosList();

	public void deleteData(Integer keyAEMain);

	public Alumnos getAlumnos(Integer keyAEMain);

	public void updateData(Alumnos alumnos);
}
