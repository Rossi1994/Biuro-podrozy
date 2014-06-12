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
    public final static String sciezkaBazy = "bazaDanych.bd";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean ready = false;
        try {
            bazaDanych = BazaDanych.wczytaj(sciezkaBazy);
            bazaDanych.policzMaxId();
            ready = true;
        } catch (IOException | ClassNotFoundException e) {
            bazaDanych = new BazaDanych();
            try {
                bazaDanych.zapisz(sciezkaBazy);
                ready = true;
            } catch (IOException e2) {
            }
        }
        
        if ( ready ) {
            MenuWindow menuWindow = new MenuWindow(bazaDanych);
        }
        
    }
    
}
