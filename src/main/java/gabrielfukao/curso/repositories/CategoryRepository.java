package gabrielfukao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gabrielfukao.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}