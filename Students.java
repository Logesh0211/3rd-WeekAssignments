package week3day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(String name) {
		System.out.println(name);
	}
	public void getStudentInfo(char email) {
		System.out.println(email);
	}
	public void getStudentInfo(long Phnumber) {
		System.out.println(Phnumber);
	}

	public static void main(String[] args) {
		Students std=new Students();
		std.getStudentInfo("123");
		std.getStudentInfo("logesh.cse43@gmail.com");
		std.getStudentInfo("8778449233");
		std.getStudentInfo("Logesh");
		

	}

}
