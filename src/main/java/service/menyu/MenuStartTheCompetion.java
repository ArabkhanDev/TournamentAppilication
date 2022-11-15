/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menyu;

import bean.Config;
import java.util.Random;
import java.util.Scanner;
import service.menu.inter.MenuStartTheCompetionInter;

/**
 *
 * @author SMART
 */
public class MenuStartTheCompetion extends Config implements MenuStartTheCompetionInter {

    @Override
    public void process() {
        
        Random rand = new Random();              
        int number = rand.nextInt(MenuRegisterService.a);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number if you input right number you win!!!");
        int numberFromThePlayer = sc.nextInt();

        if (number == numberFromThePlayer) {
            System.out.println(Config.instance().getPlayers()[number]);
            System.out.println(number);
            System.out.println("Congratulations you won!");
        } else {
            System.out.println(Config.instance().getPlayers()[number]);
            System.out.println(number);
            System.out.println("You failed");
        }

    }

}
