package com.idat.repository;

import java.util.List;

import com.idat.model.Cliente;

public interface ClienteRepository {
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
