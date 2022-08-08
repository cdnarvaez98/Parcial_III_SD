package co.edu.unicauca.distribuidos.cliente_empresa.vista;

import java.util.List;

import co.edu.unicauca.distribuidos.cliente_empresa.models.Compra;
import co.edu.unicauca.distribuidos.cliente_empresa.servicios.ClienteServices;
import co.edu.unicauca.distribuidos.cliente_empresa.servicios.UtilidadesConsola;

/**
 * La clase Menu consume los métodos de ClienteServices
 */
public class Menu {

    public static void main(String[] args) {

        ClienteServices objClienteServices = new ClienteServices();
        //System.out.println("Ingrese el tipo de identificacion: ");
        //String tipoIdPersona = UtilidadesConsola.leerCadena();
        System.out.println("Ingrese su numero de identificacion: ");
        String numIdPersona = UtilidadesConsola.leerCadena();

        int opcTipoId = 0;
        String tipoIdPersona = "";
        do {
            System.out.println("Ingrese el tipo de identificacion");
            System.out.println("1. CC");
            System.out.println("1. TI");
            System.out.println("1. CE");
            System.out.println("*************************");
            System.out.println("Ingrese una opcion: ");
            opcTipoId = UtilidadesConsola.leerEntero();

            switch (opcTipoId) {
                case 1:
                    tipoIdPersona = "CC";
                    break;
                case 2:
                    tipoIdPersona = "TI";
                    break;
                case 3:
                    tipoIdPersona = "CE";
                    break;
                default:
                    System.out.println("La opcion es incorrecta");
            }
        } while (opcTipoId != 1 && opcTipoId != 2 && opcTipoId != 3);

        String idPersona = numIdPersona.concat("-").concat(tipoIdPersona);
        System.out.println();
        System.out.println("Consultando compras para la persona con numero de identificacion " + numIdPersona
                + " y tipo de identificacion " + tipoIdPersona);
        List<Compra> objCompraConsultado = objClienteServices.consultarCompras(idPersona);
        imprimirCompra(objCompraConsultado);
    }

    private static void imprimirCompra(List<Compra> listaCompras) {

        if (!listaCompras.isEmpty() && listaCompras != null) {
            System.out.println();
            System.out.println("**************DATOS DE LA COMPRA**************");
            for (Compra compra : listaCompras) {
                System.out.println("Valor compra: " + compra.getValorCompra());
                System.out.println("Lugar compra: " + compra.getLugarCompra());
                System.out.println("Fecha y hora: " + compra.getFechaHoraCompra());
                System.out.println("----------------------------------------");
            }
        } else {
            System.out.println("NO HAY DATOS");
        }
    }
}
