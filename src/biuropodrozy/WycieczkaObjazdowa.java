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
public class WycieczkaObjazdowa extends Wycieczka implements Serializable {
    
    private String planPodrozy;
    
    public String getPlanPodrozy() { return planPodrozy; }
    public void setPlanPodrozy(String newPlanPodrozy) { planPodrozy = newPlanPodrozy; }
    
}
