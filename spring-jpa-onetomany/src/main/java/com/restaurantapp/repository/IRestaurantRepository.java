package com.restaurantapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant, Integer>{
	//derived Queries
	List<Restaurant> findByCity(String city);
	List<Restaurant> findByType(Type type);
	List<Restaurant> findByRating(double rating);
	
	//custom Queries
	
	@Query("from Restaurant r inner join r.items i where i.itemName=?1")
	List<Restaurant> findByItemName(String itemName);
	@Query("from Restaurant r inner join r.items i where i.cuisine=?1")
	List<Restaurant> findByCuisine(Cuisine cuisine);
	@Query("from Restaurant r inner join r.items i where i.category=?1")
	List<Restaurant> findByCategory(Category category);
	@Query("from Restaurant r inner join r.items i where i.cuisine=?1 and i.itemType=?2")
	List<Restaurant> findByCuisineAndType(Cuisine cuisine,Type type);
	@Query("from Restaurant r inner join r.items i where i.itemName=?1 and i.price=?2")
	List<Restaurant> findByItemNameLessPrice(String itemName,double price);
	
}
