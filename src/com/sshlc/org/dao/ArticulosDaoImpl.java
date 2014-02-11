package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.Articulos;
import com.sshlc.org.jdbc.ArticulosRowMapper;

public class ArticulosDaoImpl implements ArticulosDao {

	@Autowired
	DataSource dataSource;

        @Override
	public void insertData(Articulos articulos) {

		String sql = "INSERT INTO articulos "
				+ "(descripcion,descripcion1) VALUES (?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { articulos.getDescripcion(), articulos.getDescripcion1(),
						articulos.getKeyPA() });

	}

	
        
        
        @Override
        public List<Articulos> getArticulosList() {
		List ArticulosList = new ArrayList();

		String sql = "select * from articulos";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		ArticulosList = jdbcTemplate.query(sql, new ArticulosRowMapper());
		return ArticulosList;
	}

	
        
        
        @Override
	public void deleteData(String id) {
		String sql = "delete from articulos where id=" + id;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Articulos articulos) {

		String sql = "UPDATE articulos set descripcion = ?,descripcion1 = ? where id = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { articulos.getDescripcion(), articulos.getDescripcion1(),
						articulos.getKeyPA() });

	}

	@Override
	public Articulos getArticulos(String keyPA) {
		List<Articulos> articulosList = new ArrayList<Articulos>();
		String sql = "select * from articulos where keyPA= " + keyPA;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		articulosList = jdbcTemplate.query(sql, new ArticulosRowMapper());
		return articulosList.get(0);
	}

}
