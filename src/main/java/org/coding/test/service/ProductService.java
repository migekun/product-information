package org.coding.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private List<Product> products = new ArrayList<>();
	
	@PostConstruct
	public void init() {
//		products.add(Product.newInstance(1, "Air Conditioner", "New versio of the air conditionew", attributes));
	}
}
