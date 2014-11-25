package com.yoga.studio.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoga.studio.dao.ShoppingCartDAO;
import com.yoga.studio.model.ShoppingCart;
import com.yoga.studio.services.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	@Autowired
	ShoppingCartDAO ShoppingCartDAO;

	@Transactional
	public ShoppingCart saveShoppingCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		return ShoppingCartDAO.saveShoppingCart(shoppingCart);		
	}

	@Transactional
	public List<ShoppingCart> listShoppingCarts() {
		// TODO Auto-generated method stub
		return ShoppingCartDAO.listShoppingCarts();
	}

	@Transactional
	public ShoppingCart getShoppingCart(Long id) {
		// TODO Auto-generated method stub
		return ShoppingCartDAO.getShoppingCart(id);	
		}

	@Transactional
	public void deleteShoppingCart(Long id) {
		// TODO Auto-generated method stub
		ShoppingCartDAO.deleteShoppingCart(id);
		
	}

	//tuandang
	@Transactional
	public List<ShoppingCart> searchShoppingCarts(String searchText) {
		
		return ShoppingCartDAO.searchShoppingCarts(searchText);
	}
	

}