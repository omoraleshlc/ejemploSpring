package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sshlc.org.domain.Alumnos;

public class AlumnosExtractor implements ResultSetExtractor<Alumnos> {

    @Override
    public Alumnos extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Alumnos alumnos = new Alumnos();
		
		alumnos.setKeyAEMain(resultSet.getInt("keyAEMain"));
		alumnos.setEscuela(resultSet.getString("escuela"));
		alumnos.setMatricula(resultSet.getInt("matricula"));
		alumnos.setNombre(resultSet.getString("nombre"));
                alumnos.setTipoAlumno(resultSet.getString("tipoAlumno"));
		
		return alumnos;
	}

}
