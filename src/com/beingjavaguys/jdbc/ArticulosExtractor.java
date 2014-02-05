package com.beingjavaguys.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.beingjavaguys.domain.Articulos;

public class ArticulosExtractor implements ResultSetExtractor<Articulos> {

        @Override
	public Articulos extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Articulos articulos = new Articulos();
		articulos.setKeyPA(resultSet.getInt(1));		
		articulos.setDescripcion(resultSet.getString(2));
		articulos.setDescripcion1(resultSet.getString(3));
		
                
		
		return articulos;
	}

}
