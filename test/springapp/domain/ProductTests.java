package springapp.domain;

import junit.framework.TestCase;

public class ProductTests extends TestCase {
	
	private Product product;
	
	protected void setUp() throws Exception {
		product = new Product();
	}
	
	public void testSetAndGetDescription() {
		String testDescription = "aDescr";
		assertNull(product.getDescription());
		product.setDescription(testDescription);
		assertEquals(testDescription, product.getDescription());
	}
	
	public void testSetAndGetPrice() {
		Double testPrice = 1.0;
		assertNull(product.getPrice());
		product.setPrice(testPrice);
		assertEquals(testPrice, product.getPrice(), 0);
		
	}

}
