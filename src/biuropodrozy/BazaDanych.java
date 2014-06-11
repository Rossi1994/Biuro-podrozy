/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author onlin_000
 */
public final class BazaDanych implements Serializable {
    
    public BazaDanych(String sciezka) {
        wczytaj(sciezka);
    }
    
    private ArrayList<Wycieczka> wycieczki;
    private ArrayList<Rezerwacja> rezerwacje;
    
    transient private int maxWycieczkaId;
    transient private int maxRezerwacjaId;
    
    public void dodajWycieczke(Wycieczka newWycieczka) {
        newWycieczka.setId(maxWycieczkaId + 1);
        maxWycieczkaId++;
        wycieczki.add(newWycieczka);
    }
    
    public void dodajRezerwacje(Rezerwacja newRezerwacja) {
        newRezerwacja.setId(maxRezerwacjaId + 1);
        maxRezerwacjaId++;
        rezerwacje.add(newRezerwacja);
    }
    
    public void usunWycieczke(Wycieczka delWycieczka) {
        // TODO Dodac usuwanie wycieczki
    }
    
    public void usunRezerwacje(Rezerwacja delRezerwacja) {
        // TODO Dodac usuwanie rezerwacji
    }
    
    public void zapisz(String sciezka) {
        // TODO Dodać zapisywanie bazy
    }
    
    public void wczytaj(String sciezka) {
        // TODO Dodac wczytywanie bazy
        policzMaxId();
    }
    
    
    public ArrayList<Wycieczka> getWycieczki() { return (ArrayList<Wycieczka>)wycieczki.clone(); }
    public ArrayList<Rezerwacja> getRezerwacje() { return (ArrayList<Rezerwacja>)rezerwacje.clone(); }
    
    private void policzMaxId() {
        maxWycieczkaId = -1;
        for (Wycieczka w : wycieczki) {
            if (w.getId() > maxWycieczkaId) maxWycieczkaId = w.getId();
        }
        
        maxRezerwacjaId = -1;
        for (Rezerwacja r : rezerwacje) {
            if (r.getId() > maxRezerwacjaId) maxRezerwacjaId = r.getId();
        }
    }
}
