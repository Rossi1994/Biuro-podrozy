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
    
public final class WycieczkiTableModel extends PodstawaTableModel {
   
    public WycieczkiTableModel(Object[][] dane) {
        setColumnNames(new String[]{
                "Miejsce", "Opis", "Cena", "Hotel", "Transport", "Wyzywienie", "Wyjazd z", "Data", "Ilość miejsc", "Długość"
            });
        setData(dane);
    }
}
