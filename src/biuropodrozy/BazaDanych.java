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
    
    public void poprawWycieczke(int index, Wycieczka newWycieczka) {
        Wycieczka edytowanaWycieczka = wycieczki.get(index);
        edytowanaWycieczka.setCena(newWycieczka.getCena());
        edytowanaWycieczka.setData(newWycieczka.getData());
        edytowanaWycieczka.setDlugosc(newWycieczka.getDlugosc());
        edytowanaWycieczka.setKategoria(newWycieczka.getKategoria());
        edytowanaWycieczka.setMiejsce(newWycieczka.getMiejsce());
        edytowanaWycieczka.setOpis(newWycieczka.getOpis());
        edytowanaWycieczka.setWyjazdZ(newWycieczka.getWyjazdZ());
        edytowanaWycieczka.setWyzywienie(newWycieczka.getWyzywienie());
        edytowanaWycieczka.setIloscMiejsc(newWycieczka.getIloscMiejsc());
    }
    
    public void poprawRezerwacje(int index, Rezerwacja newRezerwacja) {
        Rezerwacja edytowanaRezerwacja = rezerwacje.get(index);
        edytowanaRezerwacja.setKlient(newRezerwacja.getKlient());
        edytowanaRezerwacja.setLiczbaMiejsc(newRezerwacja.getLiczbaMiejsc());
        edytowanaRezerwacja.setWycieczka(newRezerwacja.getWycieczka());
    }
    
    public void zapisz(String sciezka) {
        // TODO Dodać zapisywanie bazy
    }
    
    public void wczytaj(String sciezka) {
        // TODO Dodac wczytywanie bazy
        policzMaxId();
    }
    
    public Wycieczka getWycieczka(int index) { return wycieczki.get(index); }
    public Rezerwacja getRezerwacja(int index) { return rezerwacje.get(index); }
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
    
    public Object[][] getModelTabeliWycieczek() {
        Object[][] data = new Object[wycieczki.size()][10];
        
        for (int i = 0; i < wycieczki.size(); i++) {
            data[i][0] = wycieczki.get(i).getMiejsce();
            data[i][1] = wycieczki.get(i).getOpis();
            data[i][2] = wycieczki.get(i).getCena();
            data[i][3] = wycieczki.get(i).getKategoria();
            data[i][4] = wycieczki.get(i).getTransport();
            data[i][5] = wycieczki.get(i).getWyzywienie();
            data[i][6] = wycieczki.get(i).getWyjazdZ();
            data[i][7] = wycieczki.get(i).getData();
            data[i][8] = wycieczki.get(i).getIloscMiejsc();
            data[i][9] = wycieczki.get(i).getDlugosc();
        }
        
        return data;
    }
}
