package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Category;

//parametros: entidade e tipo do ID
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
