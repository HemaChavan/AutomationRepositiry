package practice_session;

public class student {

	int rno;
	String name ;
	
	student(int r ,String s) {
		rno = r;
		name = s;
	}
	void display() {
		System.out.println("student rno is "+rno);
		System.out.println("student name is "+name);
	}
	public static void main(String[] args) {
		student s1 = new student(20,"abc");
		//s1.initialise(20,"hema");
		s1.display();

	}

}
