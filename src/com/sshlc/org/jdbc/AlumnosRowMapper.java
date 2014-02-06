package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sshlc.org.domain.Alumnos;

public class AlumnosRowMapper implements RowMapper<Alumnos> {

	@Override
	public Alumnos mapRow(ResultSet resultSet, int line) throws SQLException {
		AlumnosExtractor alumnosExtractor = new AlumnosExtractor();
		return alumnosExtractor.extractData(resultSet);
	}

}
