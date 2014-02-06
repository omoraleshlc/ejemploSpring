package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.Usuarios;
import com.sshlc.org.jdbc.UsuariosRowMapper;

public class UsuariosDaoImpl implements UsuariosDao {

	@Autowired
	DataSource dataSource;

        @Override
	public void insertData(Usuarios usuarios) {

		String sql = "INSERT INTO usuarios "
				+ "(first_name,last_name, gender, city, estado) VALUES (?, ?, ?, ?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { usuarios.getUsuario(), usuarios.getNombre(),
						usuarios.getFolio() });

	}

        @Override
	public List<Usuarios> getUsuariosList() {
		List usuariosList = new ArrayList();

		String sql = "select * from usuarios";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		usuariosList = jdbcTemplate.query(sql, new UsuariosRowMapper());
		return usuariosList;
	}

	@Override
	public void deleteData(Integer folio) {
		String sql = "delete from usuarios where folio=" + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Usuarios usuarios) {
                Integer folio=usuarios.getFolio();
                //List<Usuarios> usuariosList = new ArrayList<Usuarios>();
                
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE usuarios set usuario = ?,nombre = ? where folio= " + folio;
    	
                
		jdbcTemplate.update(
				sql,
				new Object[] { usuarios.getUsuario(), usuarios.getNombre()
                                     
						});

	}

	@Override
	public Usuarios getUsuarios(Integer folio) {
		List<Usuarios> usuariosList = new ArrayList<Usuarios>();
		String sql = "select * from usuarios where folio= " + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		usuariosList = jdbcTemplate.query(sql, new UsuariosRowMapper());
		return usuariosList.get(0);
	}

}
