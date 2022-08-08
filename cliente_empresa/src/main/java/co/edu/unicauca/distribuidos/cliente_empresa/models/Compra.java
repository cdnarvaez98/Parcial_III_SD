package co.edu.unicauca.distribuidos.cliente_empresa.models;

/*
 * Clase Compra encapsula los datos que 
 * viajan entre el cliente y servidor
 */

public class Compra {
    private double valorCompra;
    private String lugarCompra;
    private String fechaHoraCompra;

    public Compra() {
        // Constructor de la clase
    }

    public Compra(double valorCompra, String lugarCompra, String fechaHoraCompra) {
        this.valorCompra = valorCompra;
        this.lugarCompra = lugarCompra;
        this.fechaHoraCompra = fechaHoraCompra;
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
