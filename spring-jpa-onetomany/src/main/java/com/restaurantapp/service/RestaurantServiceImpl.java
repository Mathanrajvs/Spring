package com.restaurantapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import com.restaurantapp.repository.IRestaurantRepository;

@Service
public class RestaurantServiceImpl implements IRestaurantService {

	private IRestaurantRepository restaurantRepository;

	@Autowired
	public void setRestaurantRepository(IRestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}

	@Override
	public Restaurant addRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);		
	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		restaurantRepository.deleteById(restaurantId);		
	}

	@Override
	public List<Restaurant> getAll() {
		return restaurantRepository.findAll();
	}

	@Override
	public Restaurant getById(int restaurantId) {
		return restaurantRepository.findById(restaurantId).get();
	}

	@Override
	public List<Restaurant> getByCity(String city) {
		return restaurantRepository.findByCity(city);
	}

	@Override
	public List<Restaurant> getByType(Type type) {
		return restaurantRepository.findByType(type);
	}

	@Override
	public List<Restaurant> getByRating(double rating) {
		return restaurantRepository.findByRating(rating);
	}

	@Override
	public List<Restaurant> getByItemName(String itemName) {
		return restaurantRepository.findByItemName(itemName);
	}

	

	@Override
	public List<Restaurant> getByCuisine(Cuisine cuisine) {
		return restaurantRepository.findByCuisine(cuisine);
	}

	@Override
	public List<Restaurant> getByCategory(Category category) {
		return restaurantRepository.findByCategory(category);
	}

	@Override
	public List<Restaurant> getByCuisineAndType(Cuisine cuisine, Type type) {
		return restaurantRepository.findByCuisineAndType(cuisine, type);
	}

	@Override
	public List<Restaurant> getByItemNameLessPrice(String itemName, double price) {
		return restaurantRepository.findByItemNameLessPrice(itemName, price);
	}

	
}
