package service;

import dao.ItemDao;
import entity.Item;

public class ItemService {
	private ItemDao ItemD = new ItemDao();

	public ItemService() {

	}

	public void addItemService(Item i) {
		ItemD.addItem(i);
	}

}
