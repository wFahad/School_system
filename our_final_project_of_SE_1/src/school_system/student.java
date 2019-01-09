/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_system;

/**
 *
 * @author 1507278
 */
public class student extends Person {

    public student(String Name, int national_ID, int age, int Phone_number, String Address, String Email) {
        super(Name, national_ID, age, Phone_number, Address, Email);
    }

    public String toString() {
        return student.super.getName() + " " + student.super.getNational_ID() + " " + student.super.getAge() + " " + student.super.getPhone_number() + " " + student.super.getAddress() + " " + student.super.getEmail();
    }

}
