package ru.school21.backend_surf_onlineshop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.school21.backend_surf_onlineshop.repository.ProductRepository;

@Service
@AllArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;
}
