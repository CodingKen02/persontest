/*
Name: Kennedy Keyes
Date: October 15, 2021
Program: Person.class
Description: This class includes a constructor that initiates 
five instance variables for each person. 
 */
package persontest;

/**
 *
 * @author codingken
 */
public class Person {
    
    // Declare instance variables
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String hairColor;
    
    // Create the constructor
    public Person(String firstName, String lastName, 
            int age, String gender, String hairColor)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor;

    } // end constructor
    
    // Set first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    // Get first name
    public String getFirstName()
    {
        return firstName;
    }
    
    // Set last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    // Get last name
    public String getLastName()
    {
        return lastName;
    }
    // Set age
    public void setage(int age)
    {
        this.age = age;
    }
    
    // Get age
    public int getage()
    {
        return age;
    }
    
    // Set gender
    public void setgender(String gender)
    {
        this.gender = gender;
    }
    
    // Get gender
    public String getgender()
    {
        return gender;
    }
    
    // Set hair color
    public void sethairColor(String hairColor)
    {
        this.hairColor = hairColor;
    }
    
    // Get hair color
    public String gethairColor()
    {
        return hairColor;
    }
    
    // Create a method called eat1()
    public String eat1()    
    {   
        return "I’m eating steak and potatoes. Want some?";
    }
    // Create a method called eat2()
    public String eat2()    
    {   
        return "I’m having chicken alfredo. Yummy!";
    }    
    // Create a method called color1()
    public String color1()    
    {   
        return "My favorite color is blue.";
    }    
    // Create a method called color2()
    public String color2()    
    {   
        return "My favorite color is purple.";
    }
    
}
