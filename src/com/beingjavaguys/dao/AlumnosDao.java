package com.beingjavaguys.dao;

import java.util.List;
import com.beingjavaguys.domain.Alumnos;

public interface AlumnosDao {
	public void insertData(Alumnos alumnos);

	public List<Alumnos> getAlumnosList();

	public void updateData(Alumnos alumnos);

	public void deleteData(String keyAEMain);

	public Alumnos getAlumnos(String keyAEMain);

}
