/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author USER
 */
public interface IStaff {
    String getId();
    String getUsername();
    String getPassword();
    String getPosition();
    
 boolean can (String action);
}
