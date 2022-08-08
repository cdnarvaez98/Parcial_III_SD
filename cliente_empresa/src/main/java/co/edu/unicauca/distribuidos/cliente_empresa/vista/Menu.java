package co.edu.unicauca.distribuidos.cliente_empresa.vista;

import java.util.List;

import co.edu.unicauca.distribuidos.cliente_empresa.models.Compra;
import co.edu.unicauca.distribuidos.cliente_empresa.servicios.ClienteServices;

/**
 * La clase Menu consume los métodos de ClienteServices
 */
public class Menu {

    public static void main(String[] args) {

        ClienteServices objClienteServices = new ClienteServices();
        System.out.println("Consultando compras para el id 1");
        List<Compra> objCompraConsultado = objClienteServices.consultarCompras(1);

        imprimirCompra(objCompraConsultado);
    }

    private static void imprimirCompra(List<Compra> listaCompras) {

        if (!listaCompras.isEmpty() && listaCompras != null) {
            System.out.println("DATOS DE LA COMPRA");
            for (Compra compra : listaCompras) {
                System.out.println("Id persona: " + compra.getNumIdPersona());
                System.out.println("Tipo id: " + compra.getTipoIdPersona());
                System.out.println("Valor compra: " + compra.getValorCompra());
                System.out.println("Lugar compra: " + compra.getLugarCompra());
                //System.out.println("Fecha y hora: " + compra.getFechaHoraCompra());
            }
        } else {
            System.out.println("NO HAY DATOS");
        }

       
    }
}
