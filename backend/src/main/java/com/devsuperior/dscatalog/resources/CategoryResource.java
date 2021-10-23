package com.devsuperior.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.services.CategoryService;
import com.devsuperior.dscatalog.services.exceptions.EntityNotFoundException;

@RestController // indica que essa classe sera um controlador REST
@RequestMapping(value = "/categories") // define a rota
public class CategoryResource {

	@Autowired
	private CategoryService service;

	@GetMapping // indica que vai ser um endpoint de request
	public ResponseEntity<List<CategoryDTO>> findAll() {
		List<CategoryDTO> list = service.findAll();

		/*
		 * LISTA MOOCK List<Category> list = new ArrayList<>(); list.add(new
		 * Category(1L, "Books")); o L indica q vai ser Long list.add(new Category(2L,
		 * "Electronics"));
		 */

		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
		// @PathVariable utilizado para casar o parametro com o id na rota

			CategoryDTO dto = service.findById(id);
			
		

		return ResponseEntity.ok().body(dto);
	}

}
