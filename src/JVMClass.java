import java.lang.Class;

class Student{
	String name;

	public Student(String name){
		this.name = name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

}

public class JVMClass{
	public static void main(String arg[]){
		Student s = new Student("Ayush Sharma");

		System.out.println(s.getName());
	}
}
