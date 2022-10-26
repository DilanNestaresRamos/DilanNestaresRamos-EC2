package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Bodega;
import com.idat.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{

	@Autowired
	private BodegaRepository repositorio;
	
	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		repositorio.guardar(bodega);
	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		repositorio.actualizar(bodega);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.eliminar(id);
	}

	@Override
	public List<Bodega> listar() {
		// TODO Auto-generated method stub
		return repositorio.listar();
	}

	@Override
	public Bodega obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
