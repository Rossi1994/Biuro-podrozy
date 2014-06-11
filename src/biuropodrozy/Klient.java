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
public class Klient implements Serializable{
    
    private String imie;
    private String nazwisko;
    private int pesel;
    private int rokUr;
    private int telefon;
    private String miejscowosc;
    private String adres;
    
    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }
    public int getPesel() { return pesel; }
    public int getRokUr() { return rokUr; }
    public int getTelefon() { return telefon; }
    public String getMiejscowosc() { return miejscowosc; }
    public String getAdres() { return adres; }
    
    public void setImie(String newImie) { imie = newImie; }
    public void setNazwisko(String newNazwisko) { nazwisko = newNazwisko; }
    public void setPesel(int newPesel) { pesel = newPesel; }
    public void setRokUr(int newRokUr) { rokUr = newRokUr; }
    public void setTelefon(int newTelefon) { telefon = newTelefon; }
    public void setMiejscowosc(String newMiejscowosc) { miejscowosc = newMiejscowosc; }
    public void setAdres(String newAdres) { adres = newAdres; }
}
