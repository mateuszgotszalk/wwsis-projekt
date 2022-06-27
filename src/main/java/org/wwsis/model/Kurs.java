package org.wwsis.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KURS")
public class Kurs {
	@Id
    @GeneratedValue
    @Column(name = "id_kurs", nullable = false)
    private Integer idKurs;
	
    @Column(name = "nazwa")
    private String nazwa;
    
    @Column(name = "skrot")
    private String skrot;
    
    @Column(name = "rodzaj")
    private String rodzaj;
  
   
    	public  Integer getIdKurs() {
    		return idKurs;
    	}
    	
    	
    	public void setIdKurs(Integer kId) {
    		this.idKurs = kId;
    	}
    	
    	public String getNazwa() {
    		return nazwa;
    	}
    	
    	
    	public void setNazwa(String nazwa) {
    		this.nazwa = nazwa;
    	}
    	
     	public String getSkrot() {
    		return skrot;
    	}
    	
    	
    	public void setSkrot(String skrot) {
    		this.skrot = skrot;
    	}
    	
     	public String getRodzaj() {
    		return rodzaj;
    	}
    	
    	
    	public void setRodzaj(String rodzaj) {
    		this.rodzaj = rodzaj;
    	}
    
}
