package ru.school21.backend_surf_onlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.school21.backend_surf_onlineshop.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }
