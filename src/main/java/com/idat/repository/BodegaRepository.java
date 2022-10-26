package com.idat.repository;

import java.util.List;

import com.idat.model.Bodega;

public interface BodegaRepository {
	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
