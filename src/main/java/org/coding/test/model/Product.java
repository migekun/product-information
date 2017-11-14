package org.coding.test.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Product {

	private Integer id;
	private String name;
	private String description;
	private String rating;
	private Collection<Attribute> attributes;
	
	private Product(Integer id, String name, String description, String rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.attributes = new ArrayList<>();
	}

	private Product(Integer id, String name, String description, String rating, Collection<Attribute> attributes) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.attributes = attributes;
	}

	public static Product newInstance(Integer id, String name, String description, String rating, Collection<Attribute> attributes) {
		return new Product(id, name, description, rating, attributes);
	}
	
	public static Product newInstance(Integer id, String name, String description, String rating) {
		return new Product(id, name, description, rating);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Collection<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(Collection<Attribute> attributes) {
		this.attributes = attributes;
	}
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
