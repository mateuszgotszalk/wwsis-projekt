package org.wwsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id_student", nullable = false)
    private Integer idStudent;

    @Column(name = "imie", nullable = false)
    private String imie;
    @Column(name = "nazwisko", nullable = false)
    private String nazwisko;
    @Column(name = "nr_dokumentu")
    private String nrDokumentu;
    @Column(name = "obywatelstwo")
    private String obywatelstwo;
    @Column(name = "email")
    private String email;
    @Column(name = "hasz")
    private String hasz;
    @Column(name = "timestamp_blokady")
    private String timestampBlokady;

    public Student() {
    }

    public Integer getIdStudent() {
        return idStudent;
    }


    public void setIdStudent(Integer sId) {
        this.idStudent = sId;
    }


    public String getImie() {
        return imie;
    }


    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrDokumentu() {
        return nrDokumentu;
    }


    public void setNrDokumentu(String nrDokumentu) {
        this.nrDokumentu = nrDokumentu;
    }


    public String getObywatelstwo() {
        return obywatelstwo;
    }


    public void setObywatelstwo(String obywatelstwo) {
        this.obywatelstwo = obywatelstwo;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getHasz() {
        return hasz;
    }


    public void setHasz(String hasz) {
        this.hasz = hasz;
    }

    public String getTimestampBlokady() {
        return timestampBlokady;
    }


    public void setTimestampBlokady(String timestampBlokady) {
        this.timestampBlokady = timestampBlokady;
    }

}
