package co.edu.unicauca.distribuidos.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.Compra;
import co.edu.unicauca.distribuidos.core.repositories.CompraRepository;

@Service
public class CompraServiceImpl implements ICompraService {

    @Autowired
    private CompraRepository servicioAccesoDatos;

    @Override
    public Compra registrarCompra(Integer idCompra, Compra objRegistrarCompra) {
        return this.servicioAccesoDatos.registrarCompra(idCompra, objRegistrarCompra);
    }

    @Override
    public ArrayList<Compra> listarCompras(Integer id) {
        return this.servicioAccesoDatos.listarComprasPorId(id);
    }

    @Override
    public ArrayList<Compra> listarCompras() {
        return this.servicioAccesoDatos.listarCompras();
    }
    
}
