package onlineFoodOrder.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long foodId;
	
	private String foodName;
	
	private int foodPrice;
	
	private String foodDescription;
	
	private int foodQuantity;
	
	private String foodSpecification;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(long foodId, String foodName, int foodPrice, String foodDescription, int foodQuantity,
			String foodSpecification) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodDescription = foodDescription;
		this.foodQuantity = foodQuantity;
		this.foodSpecification = foodSpecification;
	}

	public long getFoodId() {
		return foodId;
	}

	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodDescription() {
		return foodDescription;
	}

	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}

	public String getFoodSpecification() {
		return foodSpecification;
	}

	public void setFoodSpecification(String foodSpecification) {
		this.foodSpecification = foodSpecification;
	}
	
	

}
