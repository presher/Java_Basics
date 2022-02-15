package com.presher.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	List<Product> soldProductsList = new ArrayList<>();//not thread safe out of the box
	List<Product> purchasedProductList = new ArrayList<>();
	
	//Vector vector = new Vector();// thread safe list methods with synchronization
	
	List<Product> soldProductsList1 = new CopyOnWriteArrayList<>();//not thread safe out of the box
	List<Product> purchasedProductList1 = new CopyOnWriteArrayList<>();
	
	
	public void populateSoldProducts(){//utility method that populates product sold list
		for(int i = 0; i < 1000; i++) {
			Product prod = new Product(i, "test product_" + i);
			soldProductsList1.add(prod);
			System.out.println("Added: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void displaySoldProducts() {
		for(Product product: soldProductsList1) {
			System.out.println("PRINTING THE SOLD: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
