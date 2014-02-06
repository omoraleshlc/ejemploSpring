package com.sshlc.org.dao;

import java.util.List;
import com.sshlc.org.domain.Alumnos;

public interface AlumnosDao {
	public void insertData(Alumnos alumnos);

	public List<Alumnos> getAlumnosList();

	public void updateData(Alumnos alumnos);

	public void deleteData(Integer keyAEMain);

	public Alumnos getAlumnos(Integer keyAEMain);

}
