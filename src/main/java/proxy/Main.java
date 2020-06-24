package proxy;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Person person = new Person("John", "266476", "resources/img/proxy/face.png");
		
		System.out.println("-----Person with no proxy");
		showInformationPerson(person);
		showInformationPerson(person);
		
		System.out.println("-----Person with with proxy with permission");
		PersonProxy proxy1 = new PersonProxy(person, 1);
		showInformationPerson(proxy1);
		showInformationPerson(proxy1);
		
		System.out.println("-----Person with with proxy without permission");
		PersonProxy proxy2 = new PersonProxy(person, 0);
		showInformationPerson(proxy2);
		showInformationPerson(proxy2);
	}

	private static void showInformationPerson(Person person) throws IOException {
		System.out.println("Name: " + person.getName());
		System.out.println("Id: " + person.getIdNumber());
		System.out.println("Image width: " + person.getImage().getWidth());
		System.out.println();
	}
}