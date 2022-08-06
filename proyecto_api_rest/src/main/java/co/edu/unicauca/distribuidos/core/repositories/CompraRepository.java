package co.edu.unicauca.distribuidos.core.repositories;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.Compra;

@Service
public class CompraRepository {

    private HashMap<Integer, ArrayList<Compra>> mapaCompra;
    private ArrayList<Compra> listaCompraTemp = null;

    public CompraRepository() {
        this.mapaCompra = new HashMap<>();
        cargarCompra();
    }

    public Compra registrarCompra(Integer idCompra, Compra objRegistrarCompra) {
        Compra objCompra = null;
        if (this.mapaCompra.get(idCompra) != null) {
            if (this.mapaCompra.get(idCompra).add(objRegistrarCompra)) {
                System.out.println("Nueva compra registrada");
                objCompra = objRegistrarCompra;
            }
        } else {
            listaCompraTemp = new ArrayList<>();
            listaCompraTemp.add(objRegistrarCompra);
            if (mapaCompra.put(idCompra, listaCompraTemp) != null) {
                System.out.println("Nueva compra registrada");
                objCompra = objRegistrarCompra;
            }
        }
        return objCompra;
    }

    public ArrayList<Compra> listarComprasPorId(Integer id) {
        if(this.mapaCompra.get(id) != null) {
            return mapaCompra.get(id);
        }
        return null;
    }

    private void cargarCompra(){

        ArrayList<Compra> listC = new ArrayList<>();
        Compra objCompra1 = new Compra(1, "CC", 4000000, "Medellin", LocalDateTime.now());
        Compra objCompra2 = new Compra(2, "CE", 12000000, "Cali", LocalDateTime.now());

        listC.add(objCompra1);
        listC.add(objCompra2);
        mapaCompra.put(1, listC);
    }
}
