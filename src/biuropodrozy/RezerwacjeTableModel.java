/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

/**
 *
 * @author Paulina
 */
    
public final class RezerwacjeTableModel extends PodstawaTableModel {
   
    public RezerwacjeTableModel(Object[][] dane) {
        setColumnNames(new String[]{
                "Miejsce", "Data", "Imie", "Nazwisko", "Liczba miejsc"
            });
        setData(dane);
    }
}
