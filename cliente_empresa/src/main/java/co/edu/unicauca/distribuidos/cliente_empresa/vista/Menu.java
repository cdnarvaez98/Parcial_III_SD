package co.edu.unicauca.distribuidos.cliente_empresa.vista;

import java.util.List;

import co.edu.unicauca.distribuidos.cliente_empresa.models.Compra;
import co.edu.unicauca.distribuidos.cliente_empresa.servicios.ClienteServices;

public class Menu {
    public static void main(String[] args) {

        ClienteServices objClienteServices = new ClienteServices();
        System.out.println("Consultando compras para el id 1");
        List<Compra> objCompraConsultado = objClienteServices.consultarCompra(1);
        imprimirCompra(objCompraConsultado);
    }

    private static void imprimirCompra(List<Compra> listaCompras) {

        System.out.println("DATOS COMPRA");
        for (Compra compra : listaCompras) {
            System.out.println(compra.getNumIdPersona());
            System.out.println(compra.getTipoIdPersona());
            System.out.println(compra.getValorCompra());
            System.out.println(compra.getLugarCompra());
            System.out.println(compra.getFechaHoraCompra());
        }

    }
}
