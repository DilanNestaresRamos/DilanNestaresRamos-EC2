package com.idat.service;

import java.util.List;

import com.idat.model.Productos;

public interface ProductosService {
	void guardar(Productos producto);
	void actualizar(Productos producto);
	void eliminar(Integer id);
	List<Productos> listar();
	Productos obtener(Integer id);
}
