package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.Alumnos;
import com.sshlc.org.jdbc.AlumnosRowMapper;

public class AlumnosDaoImpl implements AlumnosDao {

	@Autowired
	DataSource dataSource;

        @Override
	public void insertData(Alumnos alumnos) {

		String sql = "INSERT INTO alumnos "
				+ "(descripcion,descripcion1) VALUES (?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { alumnos.getEscuela(), alumnos.getMatricula(),alumnos.getNombre(),
						alumnos.getTipoAlumno(),alumnos.getKeyAEMain() });

	}

	
        
        
        @Override
        public List<Alumnos> getAlumnosList() {
		List alumnosList = new ArrayList();

		String sql = "select * from alumnos";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		alumnosList = jdbcTemplate.query(sql, new AlumnosRowMapper());
		return alumnosList;
	}

	
        
        
        @Override
	public void deleteData(String keyAEMain) {
		String sql = "delete from alumnos where keyAEMain=" + keyAEMain;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Alumnos alumnos) {

		String sql = "UPDATE alumnos set matricula = ?,nombre = ?,escuela = ?,tipoAlumno=? where keyAEMain = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { alumnos.getEscuela(), alumnos.getMatricula(),alumnos.getNombre(),
						alumnos.getTipoAlumno(), alumnos.getKeyAEMain() });

	}

	@Override
	public Alumnos getAlumnos(String keyAEMain) {
		List<Alumnos> alumnosList = new ArrayList<Alumnos>();
		String sql = "select * from alumnos where keyAEMain= " + keyAEMain;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		alumnosList = jdbcTemplate.query(sql, new AlumnosRowMapper());
		return alumnosList.get(0);
	}

}
