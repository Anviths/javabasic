package equalsmethodexample;

public class Phone {

	int ram;
	int rom;
	String brand;
	
	public Phone(int ram ,int rom , String brand ) {
		
		this.ram=ram;
		this.brand =brand;
		this.rom =rom;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Phone \nram=" + ram + "gb \nrom=" + rom + "GB \n brand=" + brand ;
	}
	
	@Override
	public boolean equals( Object obj) {
		Phone p=(Phone) obj ;
		return this.ram==p.ram && this.rom==p.rom && this.brand==p.brand ;
	}
	
}
