/**
 * 
 */
package com.restaurantapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author MathanRajS
 *
 */
@Entity
public class Restaurant {
	@Id
	@GeneratedValue(generator = "restaurant_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "restaurant_gen", sequenceName = "restaurant_seq", initialValue = 100, allocationSize = 1)
	private Integer restaurantId;
	
	@Column(length = 20)
	private String name;

	@Column(length = 20)
	@Enumerated(value = EnumType.STRING)
	private Type type;
	
	@Column(length = 20)
	private String city;
	
	private double rating;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="resta_id")//to remove the junction table
	private Set<Item> items;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param type
	 * @param city
	 * @param rating
	 * @param items
	 */
	public Restaurant(String name, Type type, String city, double rating, Set<Item> items) {
		super();
		this.name = name;
		this.type = type;
		this.city = city;
		this.rating = rating;
		this.items = items;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", type=" + type + ", city=" + city
				+ ", rating=" + rating + ", items=" + items + "]";
	}




}
