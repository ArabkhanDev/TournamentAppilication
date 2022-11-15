/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import service.menu.inter.MenuService;
import service.menyu.MenuExitService;
import service.menyu.MenuLogoutService;
import service.menyu.MenuRegisterService;
import service.menyu.MenuStartTheCompetion;

/**
 *
 * @author SMART
 */
public enum Menu {
    REGISTER(1,"Register players",new MenuRegisterService()),
    START_THE_COMPETION(2,"Begin the competion",new MenuStartTheCompetion()),
    LOGOUT(3,"Logout", new MenuLogoutService()),
    EXIT(4,"Exit", new MenuExitService()),
    UNKNOWN();
    
    private  int number;
    private String label;
    private MenuService service;

    private Menu() {
    }
   
       
    private Menu(int number, String label, MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }
    
    public void process(){
        service.process();
        
    }
    public int getNumber() {
        return this.number;
    }
    
    public static Menu find(int number) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }

        return Menu.UNKNOWN;
    }
    
    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if(menus[i] != UNKNOWN)
                System.out.println(menus[i]);
        }

    }
    
    
    
    
    
    
    
    
}
