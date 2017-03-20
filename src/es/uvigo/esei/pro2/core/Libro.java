/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.pro2.core;

/**
 *
 * @author alumno
 */
public class Libro {
    public static enum TipoFormato{PAPEL,ELECTRONICO};
    private String editorial;
    private String isbn;
    private TipoFormato formato;

    public Libro(String editorial, String isbn, TipoFormato formato) {
        this.editorial = editorial;
        this.isbn = isbn;
        this.formato = formato;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public TipoFormato getFormato() {
        return formato;
    }

    public void setFormato(TipoFormato formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Libro" + "\nEditorial:" + editorial + "\nisbn:" + isbn + "\nformato:" + formato ;
    }
    
    
    
}
