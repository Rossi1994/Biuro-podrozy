/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

import java.io.Serializable;

/**
 *
 * @author onlin_000
 */
public class WycieczkaZwiedzanie extends Wycieczka implements Serializable {
    
    private String atrakcje;
    
    public String getAtrakcje() { return atrakcje; }
    public void setAtrakcje(String newAtrakcje) { atrakcje = newAtrakcje; }
    
}
