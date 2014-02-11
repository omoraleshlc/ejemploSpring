package com.sshlc.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.sshlc.org.dao.ArticulosDao;
import com.sshlc.org.domain.Articulos;


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
	public Articulos getArticulos(String keyPA) {
		return articulosdao.getArticulos(keyPA);
	}

	@Override
	public void updateData(Articulos articulos) {
		articulosdao.updateData(articulos);
		
	}


	
}
