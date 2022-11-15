/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menyu;

import service.menu.inter.MenuLogoutServiceInter;

/**
 *
 * @author SMART
 */
public class MenuLogoutService implements MenuLogoutServiceInter{

    @Override
    public void process() {
        MenuLoginService mls = new MenuLoginService();
        mls.process();
    }
    
}
