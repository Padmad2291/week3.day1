package week3.day2;

public class Students {
	public static void getStudentInfo(int id) {
		System.out.println("Student ID is "+id);
		
	}
	public static void getStudentInfo(int id,String name) {
		System.out.println("Student ID is"+id+" and name is "+name);
	}
	public static void getStudentInfo(String email,long phonenumber) {
		System.out.println("Student ID is"+email+" and number is "+phonenumber);
	}

	public static void main(String[] args) {
		getStudentInfo(5063);
		getStudentInfo(5063,"Padma");
		getStudentInfo("padmad2291@gmail.com",790430076);
		

	}

}
