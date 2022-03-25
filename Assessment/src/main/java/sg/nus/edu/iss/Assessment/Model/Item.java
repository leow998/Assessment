package sg.nus.edu.iss.Assessment.Model;

public class Item {
	private String itemName;
	private Integer quantity;

	public Item(String itemName, Integer quantity) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
	}

	public Item() {

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", quantity=" + quantity + "]";
	}

}
