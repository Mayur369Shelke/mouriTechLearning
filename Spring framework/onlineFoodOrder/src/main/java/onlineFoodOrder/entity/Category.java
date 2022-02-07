package onlineFoodOrder.entity;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Category {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	
	@OneToMany (cascade = CascadeType.ALL)
	private Food food;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(long categoryId, Food food) {
		super();
		this.categoryId = categoryId;
		this.food = food;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	
}
