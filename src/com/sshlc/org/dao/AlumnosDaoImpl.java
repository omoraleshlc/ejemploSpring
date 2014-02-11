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
				+ "(escuela,matricula, nombre, tipoAlumno) VALUES (?, ?, ?, ?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { alumnos.getEscuela(), alumnos.getMatricula(),
						alumnos.getNombre(),alumnos.getTipoAlumno() });

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
	public void deleteData(Integer keyAEMain) {
		String sql = "delete from alumnos where keyAEMain=" + keyAEMain;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Alumnos alumnos) {
                //Integer keyAEMain=alumnos.getKeyAEMain();
                //List<Alumnos> alumnosList = new ArrayList<Alumnos>();
                
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE alumnos set nombre = ? where keyAEMain= ? ";
    	
                
		jdbcTemplate.update(
				sql,
				new Object[] { alumnos.getNombre(),
                                    alumnos.getKeyAEMain()
                                     
						});

	}

	@Override
	public Alumnos getAlumnos(Integer keyAEMain) {
		List<Alumnos> alumnosList = new ArrayList<Alumnos>();
		String sql = "select * from alumnos where keyAEMain= " + keyAEMain;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		alumnosList = jdbcTemplate.query(sql, new AlumnosRowMapper());
		return alumnosList.get(0);
	}

}
