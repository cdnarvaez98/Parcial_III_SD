package co.edu.unicauca.distribuidos.core.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.models.Compra;
import co.edu.unicauca.distribuidos.core.services.ICompraService;

@RestController
@RequestMapping("/api")
public class ClienteRestControllers {
    
    @Autowired
    private ICompraService compraService;

    @GetMapping ("/compras/{idCompra}")
    public ArrayList<Compra> listarComprasPorId(@PathVariable Integer idCompra){
        ArrayList<Compra> objCompra = null;
        objCompra = compraService.listarCompras(idCompra);
        return objCompra;
    }

    @PostMapping ("/compras/{idCompra}")
    public Compra registrarCompra(@RequestBody Compra objCompra, @PathVariable Integer idCompra) {
        Compra compra = null;
        compra = compraService.registrarCompra(idCompra, objCompra);
        return compra;
    } 

    @GetMapping ("/compras")
    public ArrayList<Compra> listarCompras(){
        return compraService.listarCompras();
    }

}
