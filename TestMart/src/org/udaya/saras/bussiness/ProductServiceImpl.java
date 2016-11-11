package org.udaya.saras.bussiness;

import java.util.ArrayList;
import java.util.List;

import org.udaya.saras.model.Product;

public class ProductServiceImpl {
	
	List<String> booklist = new ArrayList<>();
	List<String> musiclist = new ArrayList<>();
	List<String> movielist = new ArrayList<>();
	
	public ProductServiceImpl(){
		booklist.add("baba1");
		booklist.add("baba2");
		booklist.add("baba3");
		
		musiclist.add("baba4");
		musiclist.add("baba5");
		musiclist.add("baba6");
		
		movielist.add("baba7");
		movielist.add("baba8");
		movielist.add("baba9");
	}
	
	public List<String> GetProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String catagory){
		switch (catagory.toLowerCase()){
		case "books":
			return booklist;
		case "music":
			return musiclist;
		case "movies":
			return movielist;
		}
		return null;
	}
	
	public boolean addProduct(String catagory, String product){
		switch (catagory.toLowerCase()){
		case "books":
			booklist.add(product);
		case "music":
			musiclist.add(product);
		case "movies":
			movielist.add(product);
		}
		return true;
	}
	
	public List<Product> getProductsv2(String category){
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Branin Book", "1234", 99999.99));
		productList.add(new Product("Udaya Book", "1234", 888888.88));
		return productList;
	}
}
