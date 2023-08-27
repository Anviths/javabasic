package video3;

public class Box {

	double length;
	
	private Box(){
		
	}
	
	private Box(double length){
		this.length=length;	}
	public static Box createBox() {
		return new Box();
	}
	public static Box createBox(double length) {
		return new Box(length);
	}
}
