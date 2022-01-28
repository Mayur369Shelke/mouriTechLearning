import java.time.LocalDate;

import com.mouritech.hibernetMapping.dao.OrderDao;
import com.mouritech.hibernetMapping.model.Items;
import com.mouritech.hibernetMapping.model.Orders;

public class manyToMany {

	public static void main(String[] args) {
	Items items1 = new Items("pizza", "small");
	Items items2 = new Items("Cock", "medium");
	Items items3 = new Items("coffee", "small");
	Items items4 = new Items("bargar", "small");
	
	Orders orders = new Orders(1234, LocalDate.of(2021, 1, 1), 560);
	orders.getItems().add(items1);
	orders.getItems().add(items2);
	orders.getItems().add(items3);
	orders.getItems().add(items4);
	
	OrderDao dao =new OrderDao();
	System.out.println("saving data in database");
	dao.saveOrder(orders);
	System.out.println("fetching data from data base");
	dao.getorder(1234);

	}

}
