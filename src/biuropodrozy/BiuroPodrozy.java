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
    private final static String sciezkaBazy = "bazaDanych.bd";
    public static boolean endOfProgram;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        endOfProgram = false;
        try {
            bazaDanych = BazaDanych.wczytaj(sciezkaBazy);
            bazaDanych.policzMaxId();
        } catch (IOException | ClassNotFoundException e) {
            bazaDanych = new BazaDanych();
            try {
                bazaDanych.zapisz(sciezkaBazy);
            } catch (IOException e2) {
                endOfProgram = true;
            }
        }
        MenuWindow menuWindow = new MenuWindow(bazaDanych);
        
        while (!endOfProgram) {
            
        }
        
        try {
            bazaDanych.zapisz(sciezkaBazy);
        } catch (IOException ex) {
            
        }
    }
    
}
