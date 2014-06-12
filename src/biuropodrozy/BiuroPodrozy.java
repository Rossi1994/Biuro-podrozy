/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

import java.io.IOException;

/**
 *
 * @author Paulina
 */
public class BiuroPodrozy {

    private static BazaDanych bazaDanych;
    private static String sciezkaBazy;
    public static boolean endOfProgram;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        endOfProgram = false;
        try {
            bazaDanych = new BazaDanych(sciezkaBazy);
        } catch (whatever) {
            bazaDanych = new BazaDanych();
            try {
                bazaDanych.zapisz(sciezkaBazy);
            } catch (IOException e) {
                endOfProgram = true;
            }
        }
        MenuWindow menuWindow = new MenuWindow(bazaDanych);
        
        while (!endOfProgram) {
            
        }
        
        bazaDanych.zapisz(sciezkaBazy);
    }
    
    
    public void exit() {
        bazaDanych.zapisz(sciezkaBazy);
        endOfProgram = true;
    }
    
}
