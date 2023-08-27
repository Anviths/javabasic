package lazyinstantiation;

public class Tyre {

	private String brand;

	//getter
	public String getBrand() {
		return brand;
	}

	//setter
	public void setBrand(String brand) {
		this.brand =brand;
	}
	//constructor
	public Tyre(String brand) {
		setBrand(brand);
	}
}
