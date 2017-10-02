package multitasking;

public class Item {

	private String type;
	private int damage;
	private int quantity = 1;
	private int weight; // Stamina - weight = Stamina while holding object ( 100-20 = 80) //
	private int hitSpeed;

	public Item(String type, int weight) {
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getQuantuty() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
    }
	public int getHitSpeed() {
		return hitSpeed;
	}
}