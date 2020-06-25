/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstpackage;

/**
 *
 * @author dell
 */
public class Human {
    String FirstName;
    String LastName;
    String Phone;
    String Email;

    public Human(String FirstName) {
        this.FirstName = FirstName;
    }

    public Human(String FirstName, String LastName, String Phone, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }
    
    public void printDetails(){
        
        System.out.print(FirstName+" "+LastName+" "+Phone+" "+Email);
        System.out.println();
    }
    
}
