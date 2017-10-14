package org.coding.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	//emulation of database
	private List<Product> dataBase = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		
		dataBase.add(Product.newInstance(1, "Air Conditioner", "New versio of the air conditioner", "A", airConditionerAttr()));
		dataBase.add(Product.newInstance(2, "Slipper", "Woman slipper", "B"));
		dataBase.add(Product.newInstance(3, "USB cable", "2m cable, suberb ", ""));
		dataBase.add(Product.newInstance(4, "Jeans", "New season jeans", "A+++"));
		dataBase.add(Product.newInstance(5, "Blazer", "Men's blazer, classic style", "C",airConditionerAttr()));
		dataBase.add(Product.newInstance(6, "Dress", "Women dress", "B"));
	}
	
	private Collection<Attribute> airConditionerAttr() {
		return Arrays.asList(
				Attribute.newInstance(1, "Energy Class", "A"), 
				Attribute.newInstance(2, "Stylish Remote controller", ""), 
				Attribute.newInstance(3, "Dehumidifying capacity", "2L/h"), 
				Attribute.newInstance(4, "Portable", "") 
				);
	}

	/**
	 * 
	 * @return list with all the products
	 */
	public List<Product> getProducts() {
		return dataBase;
	}
	
	/**
	 * 
	 * @param id the product id
	 * @return the expected product or null if it doesn't exists
	 */
	public Product getProduct(int id) {
		 return dataBase.stream().filter(product -> product.equals(id)).findFirst().orElse(null);
	}
}
