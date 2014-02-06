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
	public void updateData(Integer folio) {
            
                List<Usuarios> usuariosList = new ArrayList<Usuarios>();
                String sql = "select * from usuarios where folio= " + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		usuariosList = jdbcTemplate.query(sql, new UsuariosRowMapper());
                
                
		String sql1 = "UPDATE usuarios set usuario = ?,nombre = ? where folio= " + folio;
                System.out.println(sql1);
		JdbcTemplate jdbcTemplate1 = new JdbcTemplate(dataSource);
                
		jdbcTemplate1.update(
				sql1,
				new Object[] { usuariosList.get(1), usuariosList.get(2),
                                     
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
