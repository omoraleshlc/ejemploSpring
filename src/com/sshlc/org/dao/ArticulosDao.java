package com.sshlc.org.dao;

import java.util.List;
import com.sshlc.org.domain.Articulos;

public interface ArticulosDao {
	public void insertData(Articulos articulos);

	public List<Articulos> getArticulosList();

	public void updateData(Articulos articulos);

	public void deleteData(String id);

	public Articulos getArticulos(String id);

}
