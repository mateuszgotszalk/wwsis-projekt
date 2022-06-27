package org.wwsis.model;


import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ZAPIS")
public class Zapis {

	@Id
    @GeneratedValue
    @Column(name = "id_zapis", nullable = false)
    private int idZapis;
    @Column(name = "timestamp_zapisu")
    private Timestamp timestampZapisu;
    @Column(name = "id_grupa")
    private int idGrupa;
    @Column(name = "id_ocena")
    private int idOcena;
    @Column(name = "id_student")
    private int idStudent;
  
    public Zapis(){
    	
    	public Integer getIdZapis() {
    		return idZapis;
    	}
    	
    	
    	public void setIdZapis(Integer zId) {
    		this.idZapis = zId;
    	}
    	
    	public Timestamp getTimestampZapisu() {
    		return timestampZapisu;
    	}
    	
    	
    	public void setTimestampZapisu(Timestamp timestampZapisu) {
    		this.timestampZapisu = timestampZapisu;
    	}
    	
    	public Integer getIdGrupa() {
    		return idGrupa;
    	}
    	
    	
    	public void setIdGrupa(Integer gId) {
    		this.idGrupa = gId;
    	}
    	
    	public Integer getIdOcena() {
    		return idOcena;
    	}
    	
    	
    	public void setIdOcena(Integer oId) {
    		this.idOcena = oId;
    	}
    	
    	public Integer getIdStudent() {
    		return idStudent;
    	}
    	
    	
    	public void setIdStudent(Integer sId) {
    		this.idStudent = sId;
    	}	
    }
}
