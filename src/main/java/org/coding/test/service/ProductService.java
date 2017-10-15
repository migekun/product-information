package org.coding.test.service;

import java.util.List;

import org.coding.test.model.Product;

public interface ProductService {

	/**
	 * @return list with all the products
	 */
	List<Product> getProducts();
	
	/**
	 * 
	 * @param id the product id
	 * @return the expected product or null if it doesn't exists
	 */
	Product getProduct(int id);
}
