package video2;

public class Students {

	public static int total(Student s) {
		int sum=0;
		for(int i=0;i<s.getMarks().length;i++) {
			sum=sum+s.getMarks()[i];
		}
		return sum;
	}
	//student average
	public static int average(Student s) {
		int sum=0;
		for(int i=0;i<s.getMarks().length;i++) {
			sum=sum+s.getMarks()[i];
		}
		return sum/s.getMarks().length;
	}
	public static int max(Student s) {
		int max=s.getMarks()[0];
		for(int i=0;i<s.getMarks().length;i++) {
			if(s.getMarks()[i]<max) {
				max=s.getMarks()[i];
			}

		}
		return max;
	}
	public static int min(Student s) {
		int min=s.getMarks()[0];
		for(int i=0;i<s.getMarks().length;i++) {
			if(s.getMarks()[i]>min) {
				min=s.getMarks()[i];
			}

		}
		return min;
	}
}
