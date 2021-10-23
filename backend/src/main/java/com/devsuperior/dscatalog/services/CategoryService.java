package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired // para fazer a injeção de dependência automaticamente
	private CategoryRepository repository;

	@Transactional(readOnly = true) // garantir a integridade e o readonly, usa sempre quando for uma busca
	public List<Category> findAll() {
		return repository.findAll();
	}
}
