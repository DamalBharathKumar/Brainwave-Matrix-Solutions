package service;


import mobel.InventoryItem;
import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private List<InventoryItem> inventory = new ArrayList<>();
 
    public void addItem(InventoryItem item) {
    	
        inventory.add(item);
        System.out.println("Inventory item added.");
         
        
    }
}

