package video2;

public class PigeonDriver {
	public static void display(Pigeon obj_ref) {
		System.out.println(obj_ref.breed);
		System.out.println(obj_ref.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pigeon p=new Pigeon("parivala", 5);
		display(p);
	}

}
