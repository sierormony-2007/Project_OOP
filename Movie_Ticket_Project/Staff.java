/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author U-ser
 */
public class Staff {
  private int staffID;
  private String name;
  private double salary;
  private String position;


    public Staff(int staffID, String name, double salary, String position) {
        this.staffID = staffID;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public int getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

}
