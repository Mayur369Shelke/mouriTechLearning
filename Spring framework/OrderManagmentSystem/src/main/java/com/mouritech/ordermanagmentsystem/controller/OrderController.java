package com.mouritech.ordermanagmentsystem.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mouritech.ordermanagmentsystem.model.Order;
import com.mouritech.ordermanagmentsystem.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService ordService;
	
//	@RequestMapping(value="/listorder",method = RequestMethod.GET)
//	public String orderList(Model model) {
//		
//	List<Order> orderlist = new ArrayList<Order>();
//	orderlist.add(new Order(1, "one", 256));
//	orderlist.add(new Order(2, "two", 256));
//	orderlist.add(new Order(3, "three", 256));
//	
//	model.addAttribute("orders", orderlist);
//	return "orderslist";
	
	
	//@RequestMapping(value = "/listorder", method = RequestMethod.GET)
		 @GetMapping("/listorder")
		  public String getUsers(Model model) throws Exception{
		    List<Order> ordersList = ordService.getAllOrders();
		    model.addAttribute("Orders", ordersList);
		    return "orderlist";
		  }
		 
		 @GetMapping("/showForm")
		 public String showFormForAdd(Model model) {
			 Order newOrder = new Order();
			 model.addAttribute("order", newOrder);
			return "orderform";
			 
		 }
		 
		 @PostMapping("/saveOrder")
		 public String saveOrder(@ModelAttribute("order") Order theNewOrder) {
			 ordService.saveOrder(theNewOrder);
			 return "redirect:/oms/order/listorder";
		 }
		 
		 @GetMapping("/updateOrder")
		 public String showFormForUpdateOrder(@RequestParam("orderId") int ordid,Model model ) {
			 Order existingOrder = ordService.getOrder(ordid);
			 model.addAttribute("order", existingOrder);
			 return "orderform";
		 }
		 
		 @GetMapping("/deleteOrder")
		 public String deleteOrder(@RequestParam("orderId") int ordid) {
			 ordService.deleteOrder(ordid);
			 return "redirect:/oms/order/listorder";
		 }
	
	
	
	
		
	}


