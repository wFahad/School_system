/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_system;

/**
 *
 * @author 1506345
 */
public class Person {

    String Name;
    int national_ID;
    String Email;
    int Phone_number;
    String Address;
    int age;

    public Person() {
//this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public Person(String Name, int national_ID, int age, int Phone_number, String Address, String Email) {
        this.Name = Name;
        this.national_ID = national_ID;
        this.Phone_number = Phone_number;
        this.Address = Address;
        this.Email = Email;
        this.age = age;
    }

    public int setAge(int age) {
        return age;
    }

    public int getAge() {
        return age;
    }

    public int getNational_ID() {
        return national_ID;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public String getAddress() {
        return Address;
    }

    public String setName(String Name) {
        return Name;
    }

    public int setNational_ID(int national_ID) {
        return national_ID;
    }

    public String setEmail(String Email) {
        return Email;
    }

    public int setPhone_number(int Phone_number) {
        return Phone_number;
    }

    public String setAddress(String Address) {
        return Address;
    }

}
