package com.idat.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.model.Productos;
import com.idat.service.ProductosService;


@RestController
@RequestMapping("/producto/v1")
public class ProductosController {

	@Autowired
	private ProductosService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Productos>> listar(){
		return new ResponseEntity<List<Productos>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Productos producto ){
		service.guardar(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Productos> obtenerPorId(@PathVariable Integer id){
		
		Productos productos = service.obtener(id);
		
		if( productos != null) {
			return new ResponseEntity<Productos>(productos, HttpStatus.OK);
		}else {
			return new ResponseEntity<Productos>(HttpStatus.NOT_FOUND);
		} 
		
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Productos producto){
		
		Productos p = service.obtener(producto.getIdProducto());
		
		if( p != null) {
			service.actualizar(producto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void>eliminar(@PathVariable Integer id){
		
		Productos productos = service.obtener(id);

		if(productos != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}