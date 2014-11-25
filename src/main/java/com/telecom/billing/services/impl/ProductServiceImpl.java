package com.telecom.billing.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telecom.billing.dao.ProductDAO;
import com.telecom.billing.model.Product;
import com.telecom.billing.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;

	@Transactional
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		productDAO.saveProduct(product);

	}

	@Transactional
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return productDAO.listProducts();
	}

	@Transactional
	public Product getProduct(Long id) {
		// TODO Auto-generated method stub
		return productDAO.getProduct(id);
	}

	@Transactional
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		productDAO.deleteProduct(id);

	}

	// tuandang
	@Transactional
	public List<Product> searchProducts(String searchText) {

		return productDAO.searchProducts(searchText);
	}

}