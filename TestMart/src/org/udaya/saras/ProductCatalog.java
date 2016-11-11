package org.udaya.saras;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.udaya.saras.bussiness.ProductServiceImpl;
import org.udaya.saras.model.Product;

@WebService(name="TestMartCatalog", portName= "TestMartCatalogPort", serviceName="TestMartCatalogService", targetNamespace= "www.testmart.com")
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories(){
	return productService.GetProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String catagory){
		return productService.getProducts(catagory);
	}

	@WebMethod
	public boolean addProduct(String catagory, String product){
		return productService.addProduct(catagory, product);
	}
	
	@WebMethod
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	}
	
}
