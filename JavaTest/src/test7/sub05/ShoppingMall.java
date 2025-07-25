package test7.sub05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingMall {
	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String, List<Order>> customerOrders;
	
	public ShoppingMall() {
		this.customers = new ArrayList<>();
		this.orders = new ArrayList<>();
		this.customerOrders = new HashMap<>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
		customerOrders.put(customer.getUid(), orders);
	}
	
	public void addOrder(Order order) {
		for(Customer customer : customers) {
			if(customer.equals(order.getCustomer())) {
				customerOrders.get(customer.getUid()).add(order);
			}
		}
	}
	
	public List<Order> getOrders() {
		List<Order> allOrders = new ArrayList<>();
		for(Customer customer : customers) {
			for(Order order : customerOrders.get(customer.getUid()))
				allOrders.add(order);
		}
		
		return allOrders;
	}
}
