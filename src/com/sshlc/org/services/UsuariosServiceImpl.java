package com.sshlc.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.sshlc.org.dao.UsuariosDao;
import com.sshlc.org.domain.Usuarios;


public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	UsuariosDao usuariosdao;

	@Override
	public void insertData(Usuarios usuarios) {
		usuariosdao.insertData(usuarios);
	}

	@Override
	public List<Usuarios> getUsuariosList() {
		return usuariosdao.getUsuariosList();
	}

	@Override
	public void deleteData(Integer folio) {
		usuariosdao.deleteData(folio);
		
	}

	@Override
	public Usuarios getUsuarios(Integer folio) {
		return usuariosdao.getUsuarios(folio);
	}

        
        
	@Override
	public void updateData(Usuarios usuarios) {
		usuariosdao.updateData(usuarios);
		
	}


	
}
