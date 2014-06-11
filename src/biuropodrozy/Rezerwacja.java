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
public class Rezerwacja {

    private int liczbaMiejsc;
    private Klient klient;
    private Wycieczka wycieczka;
    
    public int getLiczbaMiejsc() { return liczbaMiejsc; }
    public Klient getKlient() { return klient; }
    public Wycieczka getWycieczka() { return wycieczka; }
    
    public void setLiczbaMiejsc(int newLiczbaMiejsc) { liczbaMiejsc = newLiczbaMiejsc; }
    public void setKlient(Klient newKlient) { klient = newKlient; }
    public void setWycieczka(Wycieczka newWycieczka) { wycieczka = newWycieczka; }
    


}
