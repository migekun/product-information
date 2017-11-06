package org.coding.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.coding.test.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInformationApplicationTests {


	@Autowired(required=false)
	private ProductService productService;
	
	@Test
	public void serviceNoNull() {
		assertNotNull("Product service es component: ",  productService);
	}
	
	@Test
	public void existProductList() {
		assertFalse(productService.getProducts().isEmpty());
	}

}
