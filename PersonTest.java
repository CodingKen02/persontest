/*
Name: Kennedy Keyes
Date: October 15, 2021
Program: PersonTest.java
Description: This program will print each person's statement(s) and information.
 */
package persontest;

/**
 *
 * @author codingken
 */
public class PersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create new person objects for Person 1, Person 2, and Person 3
        Person person1 = new Person("Felisa", "Keyes", 41, "female", "black");
        Person person2 = new Person("Chloe", "Meyer", 16, "female", "blonde");
        Person person3 = new Person("Jeremiah", "Keyes", 45, "male", "black");
        
        // Display person 1
        System.out.printf("Hello, my name is: %s %s.%n", person1.getFirstName(), 
                person1.getLastName());
        System.out.printf("I am %d years old. %n", person1.getage());
        System.out.printf("I am a %s.%n", person1.getgender());  
        System.out.printf("My hair color is %s.%n", person1.gethairColor());
        System.out.println(person1.eat1());
        
        // Display person 2
        System.out.printf("%nHello, my name is: %s %s.%n", person2.getFirstName(), 
                person2.getLastName());
        System.out.printf("I am %d years old. %n", person2.getage());
        System.out.printf("I am a %s.%n", person2.getgender());  
        System.out.printf("My hair color is %s.%n", person2.gethairColor());
        System.out.println(person2.eat2() + " " + person2.color1());
        
        // Display person 3
        System.out.printf("%nHello, my name is: %s %s.%n", person3.getFirstName(), 
                person3.getLastName());
        System.out.printf("I am %d years old. %n", person3.getage());
        System.out.printf("I am a %s.%n", person3.getgender());  
        System.out.printf("My hair color is %s.%n", person3.gethairColor());
        System.out.println(person3.eat1() + " " + person3.color2());
           
    }
}

