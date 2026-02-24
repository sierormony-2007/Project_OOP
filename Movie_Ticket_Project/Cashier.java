/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Cashier implements IStaff {

    private String id;
    private String username;
    private String password;

    public Cashier(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPosition() { return "Cashier"; }

    public boolean can(String action) {

        if (action == null) return false;

        return action.equals(Cinema.CREATE_MOVIE)
                || action.equals(Cinema.SELL_TICKET)
                || action.equals(Cinema.VIEW_MOVIES);
    }
}