package org.wwsis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KSIAZKA")
public class Ksiazka {
	@Id
    @GeneratedValue
    @Column(name = "id_ksiazka", nullable = false)
    private int idKsiazka;
    @Column(name = "isbn", unique = true)
    private String isbn;
    @Column(name = "tytul", nullable = false)
    private String tytul;
    @Column(name = "autor")
    private String autor;
    @Column(name = "wydanie")
    private String wydanie;
    @Column(name = "miejscowosc")
    private String miejscowosc;
    
    public Ksiazka(){
    	
    	public Integer getIdKsiazka() {
    		return idKsiazka;
    	}
    	
    	
    	public void setIdKsiazka(Integer kId) {
    		this.idKsiazka = kId;
    	}
    	
    	public String getIsbn() {
    		return isbn;
    	}
    	
    	
    	public void setIsbn(String isbn) {
    		this.isbn = isbn;
    	}
    	
     	public String getTytul) {
    		return tytul;
    	}
    	
    	
    	public void setTytul(String tytul) {
    		this.tytul = tytul;
    	}
    	
     	public String getAutor() {
    		return autor;
    	}
    	
    	
    	public void setAutor(String autor) {
    		this.autor = autor;
    	}
    	
    	public String getWydanie() {
    		return wydanie;
    	}
    	
    	
    	public void setWydanie(String wydanie) {
    		this.wydanie = wydanie;
    	}
    	
    	public String getMiejscowosc() {
    		return miejscowosc;
    	}
    	
    	
    	public void setMiejscowosc(String miejscowosc) {
    		this.miejscowosc = miejscowosc;
    	}
    }
}
