package org.wwsis.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OCENA")
public class Ocena {
    @Id
    @GeneratedValue
    @Column(name = "id_ocena", nullable = false)
    private int idOcena;
    @Column(name = "ocena", nullable = false)
    private double ocena;
    @Column(name = "timestamp_wystawienia")
    private Timestamp timestampWystawienia;

    public Ocena() {
    }

    public Integer getIdOcena() {
        return idOcena;
    }


    public void setIdOcena(Integer oId) {
        this.idOcena = oId;
    }

    public Double getOcena() {
        return ocena;
    }


    public void setOcena(Double ocena) {
        this.ocena = ocena;
    }

    public Timestamp getTimestampWystawienia() {
        return timestampWystawienia;
    }

    public void setTimestampWystawienia(Timestamp timestampWystawienia) {
        this.timestampWystawienia = timestampWystawienia;
    }
}
