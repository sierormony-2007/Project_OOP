/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Manager implements IStaff {
    private String id;
    private String username;
    private String password;

    public Manager(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }                   

    public String getPosition() {
        return "Manager";
    }

    public boolean can(String action) {
        // Managers can perform all actions
        return true;
    }
}

