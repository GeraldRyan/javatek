package dao;

import java.util.List;

import entity.Order;

public interface OrderDaoI {


		public void addOrder(Order i);

		public Order getOrder(int id);

		public void updateOrder();

		public void removeOrder();

		public List<Order> getAllOrders();


}
