package springapp.service;

import java.util.ArrayList;
import java.util.List;

import springapp.domain.Product;

public class SimpleProductManager implements ProductManager {

	private List<Product> products;
	
	@Override
	public void increasePrice(int percentage) {
		if(products != null) {
			for (Product product : products) {
				double newPrice = product.getPrice().doubleValue() *
					(100 + percentage)/100;
				
				product.setPrice(newPrice);
			}
		}
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
 