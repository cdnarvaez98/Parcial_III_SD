package co.edu.unicauca.distribuidos.core.models;

/*Clase compra y sus atributos */

public class Compra {
    private int numIdPersona;
    private String tipoIdPersona;
    private double valorCompra;
    private String lugarCompra;
    private String fechaHoraCompra;

    public Compra() {
        // Constructor de la clase
    }

    public Compra(int numIdPersona, String tipoIdPersona, double valorCompra, String lugarCompra, String fechaHoraCompra) {
        this.numIdPersona = numIdPersona;
        this.tipoIdPersona = tipoIdPersona;
        this.valorCompra = valorCompra;
        this.lugarCompra = lugarCompra;
        this.fechaHoraCompra = fechaHoraCompra;
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

    public String getFechaHoraCompra() {
        return fechaHoraCompra;
    }

    public void setFechaHoraCompra(String fechaHoraCompra) {
        this.fechaHoraCompra = fechaHoraCompra;
    }

}
