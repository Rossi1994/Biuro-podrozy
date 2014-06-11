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

    private int id;
    private int liczbaMiejsc;
    private Klient klient;
    private Wycieczka wycieczka;
    
    public int getId() { return id; }
    public int getLiczbaMiejsc() { return liczbaMiejsc; }
    public Klient getKlient() { return klient; }
    public Wycieczka getWycieczka() { return wycieczka; }
    
    public void setId(int newId) { id = newId; }
    public void setLiczbaMiejsc(int newLiczbaMiejsc) { liczbaMiejsc = newLiczbaMiejsc; }
    public void setKlient(Klient newKlient) { klient = newKlient; }
    public void setWycieczka(Wycieczka newWycieczka) { wycieczka = newWycieczka; }
    


}
