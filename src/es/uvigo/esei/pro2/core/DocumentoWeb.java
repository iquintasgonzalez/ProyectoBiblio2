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
public class DocumentoWeb {
    private String url;
    private Fecha fechaConsulta;

    public DocumentoWeb(String url, Fecha fechaConsulta) {
        this.url = url;
        this.fechaConsulta = fechaConsulta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Fecha getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Fecha fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    @Override
    public String toString() {
        return "DocumentoWeb" + "\nuUrl:" + url + "\nFecha Consulta:" + fechaConsulta ;
    }
    
    
    
}
