package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Usuarios;

public interface UsuariosService {
	public void insertData(Usuarios usuarios);

	public List<Usuarios> getUsuariosList();

	public void deleteData(Integer folio);

	public Usuarios getUsuarios(Integer folio);

	public void updateData(Usuarios usuarios);
}
