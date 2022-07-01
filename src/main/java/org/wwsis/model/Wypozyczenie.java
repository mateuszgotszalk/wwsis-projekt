package org.wwsis.model;


import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WYPOZYCZENIE")
public class Wypozyczenie {
    @Id
    @GeneratedValue
    @Column(name = "id_wypozyczenia", nullable = false)
    private int idWypozyczenia;
    @Column(name = "timestamp_wypozyczenia")
    private Timestamp timestampWypozyczenia;
    @Column(name = "timestamp_zwrotu")
    private Timestamp timestampZwrotu;
    @Column(name = "id_student")
    private int idStudent;
    @Column(name = "numer_egzemplarza")
    private int nrEgzemplarza;

    public Wypozyczenie() {
    }

    public Integer getIdWypozyczenia() {
        return idWypozyczenia;
    }


    public void setIdWypozyczenia(Integer wId) {
        this.idWypozyczenia = wId;
    }

    public Timestamp getTimestampWypozyczenia() {
        return timestampWypozyczenia;
    }


    public void setTimestampWypozyczenia(Timestamp timestampWypozyczenia) {
        this.timestampWypozyczenia = timestampWypozyczenia;
    }

    public Timestamp getTimestampZwrotu() {
        return timestampZwrotu;
    }


    public void setTimestampZwrotu(Timestamp timestampZwrotu) {
        this.timestampZwrotu = timestampZwrotu;
    }


    public Integer getIdStudent() {
        return idStudent;
    }


    public void setIdStudent(Integer sId) {
        this.idStudent = sId;
    }

    public Integer getNrEgzemplarza() {
        return nrEgzemplarza;
    }


    public void setNrEgzemplarza(Integer nrEgzemplarza) {
        this.nrEgzemplarza = nrEgzemplarza;
    }

}
