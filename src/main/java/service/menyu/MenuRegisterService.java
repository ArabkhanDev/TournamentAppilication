/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menyu;

import bean.Config;
import bean.Player;
import java.util.Scanner;
import service.menu.inter.MenuRegisterServiceInter;
import util.MenuUtil;

/**
 *
 * @author SMART
 */
public class MenuRegisterService implements MenuRegisterServiceInter {
    public static int a = 0;
    
    
    @Override
    public void process() {
        
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("how many players attend competion : ");
        int number = sc3.nextInt();
        
        
       
        for (int i = 0; i < number; i++) {
            
            
            Scanner sc = new Scanner(System.in);
            System.out.println("enter player name : ");
            String name = sc.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter player username: ");
            String username = sc2.nextLine();
            
            Player p = new Player();
            p.setName(name);
            p.setSurname(username);
                   
            
            Config.instance().appendPlayer(p);
            a++;
        }
        System.out.println("Participants of the competition have successfully registered");
        MenuUtil.showMenyu();
    }
    
    

}
