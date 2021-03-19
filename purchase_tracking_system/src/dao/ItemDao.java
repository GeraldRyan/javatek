package dao;

import java.util.List;

import dbConnection.DBConnection;
import entity.Item;

public class ItemDao extends DBConnection implements ItemDaoI {

	public ItemDao() {

	}

	@Override
	public void addItem(Item i) {
		this.connect();
		em.getTransaction().begin();
		em.persist(i);
		em.getTransaction().commit();
		this.disconnect();
	}

	@Override
	public Item getItem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(Item i) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void removeItem(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}



}
