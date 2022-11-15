/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menyu;

import service.menu.inter.MenuExitServiceInter;

/**
 *
 * @author SMART
 */
public class MenuExitService implements MenuExitServiceInter{

    @Override
    public void process() {
        System.out.println("The program has ended");
    }
    
}
