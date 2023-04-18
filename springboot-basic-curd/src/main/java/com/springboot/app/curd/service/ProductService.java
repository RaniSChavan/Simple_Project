package com.springboot.app.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.curd.entity.Product;
import com.springboot.app.curd.repositary.ProductRepositary;

@Service
public class ProductService {
	@Autowired
private ProductRepositary repositary;
	
	// To Add particular product
	public Product saveProduct(Product product) {
	return repositary.save(product);
	}
	
   // To Add multiple product at atime	
	public List<Product> saveProducts(List<Product> products) {
		return repositary.saveAll(products);
		}
	 
	// To retrieve all product
	public List<Product> getProducts(){
		return repositary.findAll();
	}
	
	// To retrieve a product by id
	public Product getProductById(int id) {
		return repositary.findById(id).orElse(null);
	}
	
	// To retrieve a product by name
	public Product getProductByName(String name) {
		return repositary.findByName(name).orElse(null);
	}
	
	// To delete record by id
	public String deleteProduct(int id) {
		repositary.deleteById(id);
		return "Product removed "+id;
		} 
	
	// To update a existing product by id
	public Product updateProduct(Product product) {
		Product existingProduct=repositary.findById(product.getId()).orElse(null);
	   existingProduct.setName(product.getName());
	   existingProduct.setCost(product.getCost());
	   existingProduct.setQuantity(product.getQuantity());
	   return repositary.save(existingProduct);
	}
}
