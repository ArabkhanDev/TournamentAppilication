/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menyu;

import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;
import util.MenuUtil;

/**
 *
 * @author SMART
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        System.out.println("Please login");
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("username :");
            String username = sc.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("password :");
            String password = sc2.nextLine();

            if ((username.equals("Sarkhan") && password.equals("12345"))) {
                System.out.println("Successfuly login");
                bean.Config.setLoggedIn(true);
                MenuUtil.showMenyu();
                break;
                

            } else if(i == 2){
                System.out.println("You banned");
                
            }
            
        }
        

    }
}
