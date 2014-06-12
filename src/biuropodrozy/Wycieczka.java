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
    
    private Integer id;
    private String miejsce;
    private String opis;
    private Integer cena;
    private String kategoria;
    private String transport;
    private String wyzywienie;
    private String wyjazdZ;
    private String data;
    private Integer iloscMiejsc;
    private Integer dlugosc;
    
    public Integer getId() { return id; }
    public String getMiejsce() { return miejsce; }
    public String getOpis() { return opis; }
    public Integer getCena() { return cena; }
    public String getKategoria() { return kategoria; }
    public String getTransport() { return transport; }
    public String getWyzywienie() { return wyzywienie; }
    public String getWyjazdZ() { return wyjazdZ; }
    public String getData() { return data; }
    public Integer getIloscMiejsc() { return iloscMiejsc; }
    public Integer getDlugosc() { return dlugosc; }
    
    public void setId(Integer newId) { id = newId; }
    public void setMiejsce(String newMiejsce) { miejsce = newMiejsce; }
    public void setOpis(String newOpis) { opis = newOpis; }
    public void setCena(Integer newCena) { cena = newCena; }
    public void setKategoria(String newKategoria) { kategoria = newKategoria; }
    public void setTransport(String newTransport) { transport = newTransport; }
    public void setWyzywienie(String newWyzywienie) { wyzywienie = newWyzywienie; }
    public void setWyjazdZ(String newWyjazdz) { wyjazdZ = newWyjazdz; }
    public void setData(String newData) { data = newData; }
    public void setIloscMiejsc(Integer newiloscMiejsc) { iloscMiejsc = newiloscMiejsc; }
    public void setDlugosc(Integer newDlugosc) { dlugosc = newDlugosc; }
}
