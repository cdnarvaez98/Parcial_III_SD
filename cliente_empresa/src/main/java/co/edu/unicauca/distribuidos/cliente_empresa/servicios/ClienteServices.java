package co.edu.unicauca.distribuidos.cliente_empresa.servicios;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.jackson.JacksonFeature;

import co.edu.unicauca.distribuidos.cliente_empresa.models.Compra;

public class ClienteServices {
    
    private String endPoint;
    private Client objClientePeticiones;

    public ClienteServices() {
        this.endPoint = "http://localhost:5000/api/compras";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public List<Compra> consultarCompras(Integer id) {
        List<Compra> listaCompra = null;
        WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON);
        listaCompra = objPeticion.get(new GenericType<List<Compra>>() {});
        return listaCompra;
    }

    public Compra registrarCompra(Compra objCompraRegistrar, Integer id) {
        Compra objCompra = null;
        WebTarget target = this.objClientePeticiones.target(this.endPoint+"/"+id);
        Entity<Compra> data = Entity.entity(objCompraRegistrar, MediaType.APPLICATION_JSON_TYPE);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objCompra = objPeticion.post(data, Compra.class);
        return objCompra;
    }
}
