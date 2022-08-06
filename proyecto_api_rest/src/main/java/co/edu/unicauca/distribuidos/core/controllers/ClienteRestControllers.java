package co.edu.unicauca.distribuidos.core.controllers;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping ("/compras/{idPersona}")
    public ArrayList<Compra> listarCompras(@PathVariable Integer idCompra){
        ArrayList<Compra> objCompra = null;
        objCompra = compraService.listarCompras(idCompra);
        return objCompra;
    }

    @PostMapping ("compras/{}")
    public Compra registrarCompra(@RequestBody Compra compra, @PathVariable Integer idCompra){
        Compra objCompra = null;
        objCompra = compraService.registrarCompra(idCompra, compra);
        return objCompra;
    } 

}
