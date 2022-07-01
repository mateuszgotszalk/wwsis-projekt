package org.wwsis.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GRUPA")
public class Grupa {
    @Id
    @GeneratedValue
    @Column(name = "id_grupa", nullable = false)
    private int idGrupa;

    @Column(name = "kod", nullable = false, unique = true)
    private String kod;

    @Column(name = "dzien_tyg")
    private String dzienTyg;
    @Column(name = "godz_rozpoczecia")
    private Time godzRozpoczecia;
    @Column(name = "godz_zakonczenia")
    private Time godzZakonczenia;
    @Column(name = "tydzien")
    private String tydzien;
    @Column(name = "id_prowadzacy")
    private int idProwadzacy;
    @Column(name = "id_kurs")
    private int idKurs;
    @Column(name = "id_semestr")
    private int idSemestr;

    public Grupa() {

    }

    public Integer getIdGrupa() {
        return idGrupa;
    }


    public void setIdGrupa(Integer gId) {
        this.idGrupa = gId;
    }


    public String getKod() {
        return kod;
    }


    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getDzienTyg() {
        return dzienTyg;
    }


    public void setDzienTyg(String dzientyg) {
        this.dzienTyg = dzienTyg;
    }

    public Time getGodzRozpoczecia() {
        return godzRozpoczecia;
    }


    public void setGodzRozpoczecia(Time godzRozpoczecia) {
        this.godzRozpoczecia = godzRozpoczecia;
    }

    public Time getGodzZakonczenia() {
        return godzZakonczenia;
    }


    public void setGodzZakonczenia(Time godzZakonczenia) {
        this.godzZakonczenia = godzZakonczenia;
    }

    public String getTydzien() {
        return tydzien;
    }


    public void setTydzien(String tydzien) {
        this.tydzien = tydzien;
    }

    public Integer getIdProwadzacy() {
        return idProwadzacy;
    }


    public void setIdProwadzacy(Integer pId) {
        this.idProwadzacy = pId;

    }

    public Integer getIdKurs() {
        return idKurs;
    }


    public void setIdKurs(Integer kId) {
        this.idKurs = kId;
    }

    public Integer getIdSemestr() {
        return idSemestr;
    }


    public void setIdSemestr(Integer semId) {
        this.idSemestr = semId;
    }
}
