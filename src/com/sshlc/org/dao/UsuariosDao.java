package com.sshlc.org.dao;

import java.util.List;
import com.sshlc.org.domain.Usuarios;

public interface UsuariosDao {
	public void insertData(Usuarios usuarios);

	public List<Usuarios> getUsuariosList();

	public void updateData(Usuarios usuarios);

	public void deleteData(Integer folio);

	public Usuarios getUsuarios(Integer folio);

}
