package ru.school21.backend_surf_onlineshop.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "product", schema = "backendshop")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private boolean isSelected = false;

	private long price;

	@Enumerated(EnumType.STRING)
	private ProductType type;

	private String image;

	private String description;
}
