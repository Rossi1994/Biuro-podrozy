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
public class Rezerwacja implements Serializable {

    public Rezerwacja() {
        klient = new Klient();
        wycieczkaId = -1;
        id = -1;
        liczbaMiejsc = 0;
    }
    
    private int id;
    private int liczbaMiejsc;
    private Klient klient;
    private int wycieczkaId;
    
    public int getId() { return id; }
    public int getLiczbaMiejsc() { return liczbaMiejsc; }
    public Klient getKlient() { return klient; }
    public Integer getWycieczkaId() { return wycieczkaId; }
    
    public void setId(int newId) { id = newId; }
    public void setLiczbaMiejsc(int newLiczbaMiejsc) { liczbaMiejsc = newLiczbaMiejsc; }
    public void setKlient(Klient newKlient) { klient = newKlient; }
    public void setWycieczkaId(Integer newWycieczkaId) { wycieczkaId = newWycieczkaId; }
    
    public Wycieczka getWycieczka(BazaDanych bazaDanych) {
        return bazaDanych.getWycieczkaPrzezId(wycieczkaId);
    }
    
    public void setWycieczka(Wycieczka newWycieczka, BazaDanych bazaDanych) {
        int index = bazaDanych.getWycieczki().indexOf(newWycieczka);
        if (index != -1) { wycieczkaId = index; }
        else wycieczkaId = 0;
    }

}
