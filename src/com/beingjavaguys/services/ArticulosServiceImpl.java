package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.beingjavaguys.dao.ArticulosDao;
import com.beingjavaguys.domain.Articulos;


public class ArticulosServiceImpl implements ArticulosService {

	@Autowired
	ArticulosDao articulosdao;

	@Override
	public void insertData(Articulos articulos) {
		articulosdao.insertData(articulos);
	}

	@Override
	public List<Articulos> getArticulosList() {
		return articulosdao.getArticulosList();
	}

	@Override
	public void deleteData(String id) {
		articulosdao.deleteData(id);
		
	}

	@Override
	public Articulos getArticulos(String id) {
		return articulosdao.getArticulos(id);
	}

	@Override
	public void updateData(Articulos articulos) {
		articulosdao.updateData(articulos);
		
	}


	
}
