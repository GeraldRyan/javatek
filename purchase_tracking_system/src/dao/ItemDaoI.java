package dao;

import java.util.List;

import entity.Item;

public interface ItemDaoI {

	public void addItem(Item i);

	public Item getItem(int id);

	public void updateItem(Item i);

	public void removeItem(int id);

	public List<Item> getAllItems();

}
