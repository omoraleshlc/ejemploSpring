package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sshlc.org.domain.Articulos;

public class ArticulosRowMapper implements RowMapper<Articulos> {

	@Override
	public Articulos mapRow(ResultSet resultSet, int line) throws SQLException {
		ArticulosExtractor articulosExtractor = new ArticulosExtractor();
		return articulosExtractor.extractData(resultSet);
	}

}
