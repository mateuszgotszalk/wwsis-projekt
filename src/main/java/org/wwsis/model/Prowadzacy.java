package org.wwsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROWADZACY")
public class Prowadzacy{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_prowadzacy", nullable = false)
    private Integer idProwadzacy;
	
    @Column(name = "tytul", nullable = false)
    private String tytul;
    
    @Column(name = "imie", nullable = false)
    private String imie;
    
    @Column(name = "nazwisko", nullable = false)
    private String nazwisko;
  
   
    	
    	public Integer getIdProwadzacy() {
    		return idProwadzacy;
    	}
    	
    	
    	public void setIdProwadzacy(Integer pId) {
    		this.idProwadzacy = pId;
    	}
    	
    	public String getTytul() {
    		return tytul;
    	}
    	
    	
    	public void setTytul(String tytul) {
    		this.tytul = tytul;
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
    
}
