package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Productos;
import com.idat.repository.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService{

	@Autowired
	private ProductosRepository repositorio;
	
	@Override
	public void guardar(Productos producto) {
		// TODO Auto-generated method stub
		repositorio.guardar(producto);
	}

	@Override
	public void actualizar(Productos producto) {
		// TODO Auto-generated method stub
		repositorio.actualizar(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);
	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return repositorio.listar();
	}

	@Override
	public Productos obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.obtener(id);
	}

}
