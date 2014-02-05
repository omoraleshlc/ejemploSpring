package com.beingjavaguys.services;

import java.util.List;

import com.beingjavaguys.domain.Articulos;

public interface ArticulosService {
	public void insertData(Articulos articulos);

	public List<Articulos> getArticulosList();

	public void deleteData(String id);

	public Articulos getArticulos(String id);

	public void updateData(Articulos articulos);
}
