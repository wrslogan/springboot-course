package course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}
