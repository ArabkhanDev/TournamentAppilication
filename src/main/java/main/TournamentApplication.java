/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;


import service.menyu.MenuLoginService;

/**
 *
 * @author SMART
 */
public class TournamentApplication {

    public static void main(String[] args) {
        MenuLoginService mrs = new MenuLoginService();
        mrs.process();

        

    }
}
