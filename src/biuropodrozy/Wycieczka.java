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
public class Wycieczka implements Serializable {
    
    public Wycieczka() {
        
    }
    
    private int id;
    private String miejsce;
    private String opis;
    private int cena;
    private String kategoria;
    private String transport;
    private String wyzywienie;
    private String wyjazdz;
    private String data;
    private int iloscMiejsc;
    private int dlugosc;
    
    public int getId() { return id; }
    public String getMiejsce() { return miejsce; }
    public String getOpis() { return opis; }
    public int getCena() { return cena; }
    public String getKategoria() { return kategoria; }
    public String getTransport() { return transport; }
    public String getWyzywienie() { return wyzywienie; }
    public String getWyjazdz() { return wyjazdz; }
    public String getData() { return data; }
    public int getiloscMiejsc() { return iloscMiejsc; }
    public int getDlugosc() { return dlugosc; }
    
    public void setId(int newId) { id = newId; }
    public void setMiejsce(String newMiejsce) { miejsce = newMiejsce; }
    public void setOpis(String newOpis) { opis = newOpis; }
    public void setCena(int newCena) { cena = newCena; }
    public void setKategoria(String newKategoria) { kategoria = newKategoria; }
    public void setTransport(String newTransport) { transport = newTransport; }
    public void setWyzywienie(String newWyzywienie) { wyzywienie = newWyzywienie; }
    public void setWyjazdz(String newWyjazdz) { wyjazdz = newWyjazdz; }
    public void setData(String newData) { data = newData; }
    public void setiloscMiejsc(int newiloscMiejsc) { iloscMiejsc = newiloscMiejsc; }
    public void setDlugosc(int newDlugosc) { dlugosc = newDlugosc; }
}
