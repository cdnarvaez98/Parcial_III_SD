package co.edu.unicauca.distribuidos.core.services;

import java.util.ArrayList;

import co.edu.unicauca.distribuidos.core.models.Compra;

/*
 * Interface donde se definen los servicios que
 * pueden ser consumidos por el controlador
 */

public interface ICompraService {
    public Compra registrarCompra(Integer idCompra, Compra objRegistrarCompra);

    public ArrayList<Compra> listarCompras(Integer id);

    public ArrayList<Compra> listarCompras();
}
