package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Articulos;

public interface ArticulosService {
	public void insertData(Articulos articulos);

	public List<Articulos> getArticulosList();

	public void deleteData(String keyPA);

	public Articulos getArticulos(String keyPA);

	public void updateData(Articulos articulos);
}
