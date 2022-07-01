package org.wwsis.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEMESTR")
public class Semestr {
    @Id
    @GeneratedValue
    @Column(name = "id_semestr")
    private Integer idSemestr;

    @Column(name = "rok_rozpoczecia")
    private Integer rokRozpoczecia;

    @Column(name = "pora_roku")
    private String poraRoku;


    public Semestr() {
    }

    public Integer getIdSemestr() {
        return idSemestr;
    }


    public void setIdSemestr(Integer semId) {
        this.idSemestr = semId;
    }

    public Integer getRokRozpoczecia() {
        return rokRozpoczecia;
    }


    public void setRokRozpoczecia(Integer rokRozpoczecia) {
        this.rokRozpoczecia = rokRozpoczecia;
    }

    public String getPoraRoku() {
        return poraRoku;
    }


    public void setPoraRoku(String poraRoku) {
        this.poraRoku = poraRoku;
    }
}
