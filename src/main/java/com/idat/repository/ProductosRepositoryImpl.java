package com.idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.model.Productos;

@Repository
public class ProductosRepositoryImpl implements ProductosRepository{
	
	List<Productos> almacenamiento = new ArrayList<>();
	
	@Override
	public void guardar(Productos producto) {
		// TODO Auto-generated method stub
		almacenamiento.add(producto);
	}

	@Override
	public void actualizar(Productos producto) {
		// TODO Auto-generated method stub
		Productos existeActualizar = obtener(producto.getIdProducto());
		eliminar(existeActualizar.getIdProducto());
		almacenamiento.add(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Productos existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);
	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Productos obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
