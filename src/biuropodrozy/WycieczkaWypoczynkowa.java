/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

import java.io.Serializable;

/**
 *
 * @author Paulina
 */
public class WycieczkaWypoczynkowa extends Wycieczka implements Serializable {
    
    private String udogodnienia;
    
    public String getUdogodnienia() { return udogodnienia; }
    public void setUdogodnienia(String newUdogodnienia) { udogodnienia = newUdogodnienia; }
    
}
