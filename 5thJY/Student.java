class Student{
	String name;
	float age;
	String usn;
	String clgName;
	Student(String name){
		System.out.println("Student Name : "+name);
	}
	Student(String name,float age,String usn){
		System.out.println("Student name : "+name);
		System.out.println("Student age is : "+age);
		System.out.println("Student usn : "+usn);
		this.name = "studentName";
		this.age = 22;
		this.usn = "4ra19cs007";
		
	}
	Student(String name,float age,String usn,String clgName){
		System.out.println("Student name : "+name);
		System.out.println("Student age is: "+age);
		System.out.println("Student usn : "+usn);
		System.out.println("Student college Name : "+clgName);
		this.name = "studentName";
		age = 23;
		this.usn = "4ra19cs007l";
		this.clgName = "rit";
}
}