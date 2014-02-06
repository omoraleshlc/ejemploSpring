package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sshlc.org.domain.Usuarios;

public class UsuariosRowMapper implements RowMapper<Usuarios> {

	@Override
	public Usuarios mapRow(ResultSet resultSet, int line) throws SQLException {
		UsuariosExtractor usuariosExtractor = new UsuariosExtractor();
		return usuariosExtractor.extractData(resultSet);
	}

}
