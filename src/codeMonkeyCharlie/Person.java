package codeMonkeyCharlie;

public class Person {
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public Person(String name) {
		this.name =name;
		
		System.out.println("Person yaratildi :"+ name);
	}

	public Person merhabadedi(Person hebele) {
		//System.out.println(name + " merhaba dedi ");
		System.out.println(hebele.getName());
		return hebele;
	}
	
	
}
