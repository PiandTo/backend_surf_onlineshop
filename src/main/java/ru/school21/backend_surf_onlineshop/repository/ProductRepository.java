package ru.school21.backend_surf_onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.school21.backend_surf_onlineshop.models.Product;
import ru.school21.backend_surf_onlineshop.models.ProductType;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByType(ProductType type);
}
