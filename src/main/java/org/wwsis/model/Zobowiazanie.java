package org.wwsis.model;


import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ZOBOWIAZANIE")
public class Zobowiazanie {
	@Id
    @GeneratedValue
    @Column(name = "id_zobowiazania", nullable = false)
    private int idZobowiazania;
    @Column(name = "kwota")
    private double kwota;
    @Column(name = "tytul")
    private String tytul;
    @Column(name = "timestamp_stworzenia")
    private Timestamp timestampStworzenia;
    @Column(name = "timestamp_oplacenia")
    private Timestamp timestampOplacenia;
    @Column(name = "id_student")
    private int idStudent;
  
    public Zobowiazanie(){
    	
    	public Integer getIdZobowiazania() {
    		return idZobowiazania;
    	}
    	
    	
    	public void setIdZobowiazania(Integer zId) {
    		this.idZobowiazania = zId;
    	}
    	
    	public Double getKwota() {
    		return kwota;
    	}
    	
    	
    	public void setKwota(Double kwota) {
    		this.kwota = kwota;
    	}
    	
    	public String getTytul() {
    		return tytul;
    	}
    	
    	
    	public void setTytul(String tytul) {
    		this.tytul = tytul;
    	}
    	
     	public Timestamp getTimestampStworzenia() {
    		return timestampStworzenia;
    	}
    	
    	
    	public void setTimestampStworzenia(Timestamp timestampStworzenia) {
    		this.timestampStworzenia = timestampStworzenia;
    	}
    	
       	public Timestamp getTimestampOplacenia() {
    		return timestampOplacenia;
    	}
    	
    	
    	public void setTimestampOplacenia(Timestamp timestampOplacenia) {
    		this.timestampOplacenia = timestampOplacenia;
    	}
     	public Integer getIdStudent() {
    		return idStudent;
    	}
    	
    	
    	public void setIdStudent(Integer sId) {
    		this.idStudent = sId;
    	}
}
}
