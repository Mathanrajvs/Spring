package com.restaurantapp.service;

import java.util.List;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;

public interface IRestaurantService {
	Restaurant addRestaurant(Restaurant restaurant);
	void updateRestaurant(Restaurant restaurant);
	void deleteRestaurant(int restaurantId);
	List<Restaurant> getAll();
	Restaurant getById(int restaurantId);
	
	List<Restaurant> getByCity(String city);
	List<Restaurant> getByType(Type type);
	List<Restaurant> getByRating(double rating);
	
	List<Restaurant> getByItemName(String itemName);
	List<Restaurant> getByCuisine(Cuisine cuisine);
	List<Restaurant> getByCategory(Category category);
	List<Restaurant> getByCuisineAndType(Cuisine cuisine,Type type);
	List<Restaurant> getByItemNameLessPrice(String itemName,double price);
	
	
}
