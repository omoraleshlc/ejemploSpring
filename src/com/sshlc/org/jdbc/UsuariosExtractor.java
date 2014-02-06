package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sshlc.org.domain.Usuarios;

public class UsuariosExtractor implements ResultSetExtractor<Usuarios> {

    @Override
    public Usuarios extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Usuarios usuarios = new Usuarios();
		
		usuarios.setFolio(resultSet.getInt("folio"));
		usuarios.setUsuario(resultSet.getString("usuario"));
		usuarios.setNombre(resultSet.getString("nombre"));
		
		
		return usuarios;
	}

}
