package org.wwsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EGZEMPLARZ_KSIAZKI")
public class EgzemplarzKsiazki {
	@Id
    @GeneratedValue
    @Column(name = "numer_egzemplarza", nullable = false)
    private int nrEgzemplarza;
    @Column(name = "stan", nullable = false)
    private String stan;
    @Column(name = "id_ksiazka")
    private int idKsiazka;
  
  
    public EgzemplarzKsiazki(){
    	
    	public Integer getNrEgzemplarza() {
    		return nrEgzemplarza;
    	}
    	
    	
    	public void setNrEgzemplarza(Integer nrEgzemplarza) {
    		this.nrEgzemplarza = nrEgzemplarza;
    	}
    	
    	public String getStan() {
    		return stan;
    	}
    	
    	
    	public void setStan(String stan) {
    		this.stan = stan;
    	}
    	
     	public Integer getIdKsiazka() {
    		return idKsiazka;
    	}
    	
    	
    	public void setIdKsiazka(Integer kId) {
    		this.idKsiazka = kId;
    	}
    	
     	
    }
}
