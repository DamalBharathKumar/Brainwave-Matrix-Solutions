package mobel;

public class InventoryItem {
    private String name;
    private int quantity;
    private double cost;

    public InventoryItem(String name, int quantity,double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost=cost;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
    
}
