/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

public class Main {
    public static void main(String[] args) {


        Staff staff1 = new Staff(1, "Alice", 3000.0, "Manager");
        Staff staff2 = new Staff(2, "Bob", 2000.0, "Cashier");

        System.out.println("Staff ID: " + staff1.getStaffID());
        System.out.println("Name: " + staff1.getName());
        System.out.println("Position: " + staff1.getPosition());
        System.out.println("Salary: $" + staff1.getSalary());

        System.out.println();

        System.out.println("Staff ID: " + staff2.getStaffID());
        System.out.println("Name: " + staff2.getName());
        System.out.println("Position: " + staff2.getPosition());
        System.out.println("Salary: $" + staff2.getSalary());

    }
             

}