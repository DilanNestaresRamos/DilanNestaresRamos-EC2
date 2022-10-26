package com.idat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.model.Cliente;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository{
	
	List<Cliente> almacenamiento = new ArrayList<>();
	
	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		almacenamiento.add(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente existeActualizar = obtener(cliente.getIdCliente());
		eliminar(existeActualizar.getIdCliente());
		almacenamiento.add(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Cliente existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Cliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
