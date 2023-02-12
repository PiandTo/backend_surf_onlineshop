package ru.school21.backendshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.school21.backendshop.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }
