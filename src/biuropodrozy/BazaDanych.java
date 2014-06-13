/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Paulina
 */
public final class BazaDanych implements Serializable {
    
    public BazaDanych() {
        wycieczki = new ArrayList();
        rezerwacje = new  ArrayList();
        maxWycieczkaId = 0;
        maxRezerwacjaId = 0;
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
    
    public void usunWycieczke(Wycieczka delWycieczka) { usunWycieczke(wycieczki.indexOf(delWycieczka)); }
    
    public void usunWycieczke(int indexWycieczki) {
        int idWycieczki = getWycieczka(indexWycieczki).getId();
        int i = rezerwacje.size() - 1;
        while (i >= 0) {
            if (rezerwacje.get(i).getWycieczkaId() == idWycieczki) {
                usunRezerwacje(i);
            }
            i--;
        }
        wycieczki.remove(indexWycieczki);
    }
    
    public void usunRezerwacje(Rezerwacja delRezerwacja) { usunRezerwacje(rezerwacje.indexOf(delRezerwacja)); }
    
    public void usunRezerwacje(int indexRezerwacja) {
        rezerwacje.remove(indexRezerwacja);
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
        edytowanaRezerwacja.setWycieczkaId(newRezerwacja.getWycieczkaId());
    }
    
    public void zapisz(String sciezka) throws FileNotFoundException, IOException {
        FileOutputStream fileStream = new FileOutputStream(sciezka);
        ObjectOutputStream os = new ObjectOutputStream(fileStream);
        os.writeObject(this);
        os.close();
        fileStream.close();
    }
    
    public static BazaDanych wczytaj(String sciezka) throws IOException, ClassNotFoundException {
        FileInputStream fileStream = new FileInputStream(sciezka);
        ObjectInputStream os = new ObjectInputStream(fileStream);
        return (BazaDanych)os.readObject();
    }
    
    public Wycieczka getWycieczka(int index) {
        return wycieczki.get(index);
    }
    public Wycieczka getWycieczkaPrzezId(int id) {
        for (Wycieczka w : wycieczki) {
            if (w.getId() == id) return w;
        }
        return getWycieczka(0);
    }
    public Rezerwacja getRezerwacja(int index) {
        return rezerwacje.get(index);
    }
    public ArrayList<Wycieczka> getWycieczki() { return wycieczki; }
    public ArrayList<Rezerwacja> getRezerwacje() { return rezerwacje; }
    
    public void policzMaxId() {
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
    
    public Object[][] getModelTabeliRezerwacji() {
        Object[][] data = new Object[rezerwacje.size()][5];
        
        for (int i = 0; i < rezerwacje.size(); i++) {
            data[i][0] = rezerwacje.get(i).getWycieczka(this).getMiejsce();
            data[i][1] = rezerwacje.get(i).getWycieczka(this).getData();
            data[i][2] = rezerwacje.get(i).getKlient().getImie();
            data[i][3] = rezerwacje.get(i).getKlient().getNazwisko();
            data[i][4] = rezerwacje.get(i).getLiczbaMiejsc();
        }
        
        return data;
    }
}
