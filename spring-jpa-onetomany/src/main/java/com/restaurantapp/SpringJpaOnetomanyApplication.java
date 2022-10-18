package com.restaurantapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Item;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.Type;
import com.restaurantapp.service.IRestaurantService;

@SpringBootApplication
public class SpringJpaOnetomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOnetomanyApplication.class, args);
	}
	
	IRestaurantService restaurantService;
	@Autowired
	public void setRestaurantService(IRestaurantService restaurantService) {
		this.restaurantService = restaurantService;
	}
	@Override
	public void run(String... args) throws Exception {
//		Item item1=new Item("Briyani",Category.FASTFOOD,Cuisine.SI,Type.VEG,200);
//		Item item2=new Item("Naam",Category.FASTFOOD,Cuisine.SI,Type.VEG,50);
//		Item item3=new Item("Chincken Briyani",Category.FASTFOOD,Cuisine.SI,Type.NONVEG,200);
//		
//		Set<Item> items=new HashSet<>(Arrays.asList(item1,item2,item3));
//		Restaurant restaurant1=new Restaurant("sai priya",Type.VEG,"Bangalore",3,items);
//		restaurantService.addRestaurant(restaurant1);
//		
//		Item item4=new Item("Noodles",Category.FASTFOOD,Cuisine.CHINESE,Type.VEG,200);
//		Item item5=new Item("Chapathi",Category.MAINCOURSE,Cuisine.NI,Type.VEG,50);
//		
//		Set<Item> itemsList=new HashSet<>(Arrays.asList(item4,item5));
//		Restaurant restaurant2=new Restaurant("Mahpil",Type.VEG,"Bangalore",3,itemsList);
//		restaurantService.addRestaurant(restaurant2);
		
//		Item item6=new Item("Chicken Noodles",Category.FASTFOOD,Cuisine.CHINESE,Type.VEG,100);
//		Item item7=new Item("Mutton Briyani",Category.MAINCOURSE,Cuisine.NI,Type.VEG,500);
//		
//		Set<Item> itemsList=new HashSet<>(Arrays.asList(item6,item7));
//		Restaurant restaurant3=new Restaurant("Danheol",Type.VEG,"Hyderabad",3,itemsList);
//		restaurantService.addRestaurant(restaurant3);
		
//		Item item8=new Item("Idle",Category.BREAKFAST,Cuisine.SI,Type.VEG,20);
//		Item item9=new Item("Poori",Category.BREAKFAST,Cuisine.SI,Type.VEG,50);
//		

	
//		Item item8=new Item("Idle",Category.BREAKFAST,Cuisine.SI,Type.VEG,20);
//		Restaurant restaurant=restaurantService.getById(105);
//		restaurant.setItems(restaurant.getItems().add(item8));//adding with previous list
//		restaurant.setItems(new HashSet<>(Arrays.asList(item8)));//adding a new list
//		System.out.println("Updating Restaurant....");
//		restaurantService.updateRestaurant(restaurant);
	
		
//		System.out.println("Delete By ID...");
//		restaurantService.deleteRestaurant(109);
		
//		System.out.println("Get By ID....");
//		Restaurant restaurant=restaurantService.getById(105);
//		System.out.println(restaurant);
//		
//		System.out.println("Get By City....");
//		restaurantService.getByCity("Chennai").forEach(System.out::println);
//		
//		System.out.println("Get By Rating....");
//		restaurantService.getByRating(4).forEach(System.out::println);
//		
//		System.out.println("Get By Type....");
//		restaurantService.getByType(Type.NONVEG).forEach(System.out::println);
//		
		
//		System.out.println("Get By Item Name....");
//		restaurantService.getByItemName("Idle").forEach(System.out::println);
		
//		System.out.println("Get By Category....");
//		restaurantService.getByCategory(Category.MAINCOURSE).forEach(System.out::println);
		
//		System.out.println("Get By Item Name and Price....");
//		restaurantService.getByItemNameLessPrice("Briyani", 200).forEach(System.out::println);
		
		
		
		
		
		
		
		
//		System.out.println("Get By Cuisine....");
//		restaurantService.getByCuisine(Cuisine.NI).forEach(System.out::println);
		
		
//		
//		System.out.println("Get By Cuisine and Type....");
//		restaurantService.getByCuisineAndType(Cuisine.SI,Type.NONVEG).forEach(System.out::println);
		
//		System.out.println("Print All....");
//		restaurantService.getAll().forEach(System.out::println);
		
		
	}
	

}
