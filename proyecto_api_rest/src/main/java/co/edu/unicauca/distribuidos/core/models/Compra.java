package co.edu.unicauca.distribuidos.core.models;

import java.time.LocalDateTime;

/*Clase compra y sus atributos */

public class Compra {
    private int numIdPersona;
    private String tipoIdPersona;
    private double valorCompra;
    private String lugarCompra;
    //private LocalDateTime fechaHoraCompra;

    public Compra() {
        // Constructor de la clase
    }

    public Compra(int numIdPersona, String tipoIdPersona, double valorCompra, String lugarCompra) {
        this.numIdPersona = numIdPersona;
        this.tipoIdPersona = tipoIdPersona;
        this.valorCompra = valorCompra;
        this.lugarCompra = lugarCompra;
    }

    public int getNumIdPersona() {
        return numIdPersona;
    }

    public void setNumIdPersona(int numIdPersona) {
        this.numIdPersona = numIdPersona;
    }

    public String getTipoIdPersona() {
        return tipoIdPersona;
    }

    public void setTipoIdPersona(String tipoIdPersona) {
        this.tipoIdPersona = tipoIdPersona;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getLugarCompra() {
        return lugarCompra;
    }

    public void setLugarCompra(String lugarCompra) {
        this.lugarCompra = lugarCompra;
    }
    

   
   

}
