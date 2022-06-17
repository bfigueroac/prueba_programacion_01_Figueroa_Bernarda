
package prueba.programacion.controlador;

import java.util.List;
import prueba.programacion.servicio.ClienteServicio;
import prueba.programacion.modelo.Cliente;

public class ClienteControl {
    private final ClienteServicio clienteServicio = new ClienteServicio();
    
    public Cliente crear(String [] args){
        var cliente = new Cliente(Integer.valueOf(args[0]),args[1],args[2],args[3],args[4]);
        this.clienteServicio.crear(cliente);
        return cliente;
    }
    
    public List<Cliente> listar(){
        return this.clienteServicio.listar();
    }
}
