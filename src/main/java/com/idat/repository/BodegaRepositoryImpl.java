package com.idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.model.Bodega;

@Repository
public class BodegaRepositoryImpl implements BodegaRepository{

	List<Bodega> almacenamiento = new ArrayList<>();
	
	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		almacenamiento.add(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		Bodega existeActualizar = obtener(bodega.getIdBodega());
		eliminar(existeActualizar.getIdBodega());
		almacenamiento.add(bodega);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Bodega existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);
	}

	@Override
	public List<Bodega> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Bodega obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
