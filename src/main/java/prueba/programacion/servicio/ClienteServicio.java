/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.programacion.servicio;

import java.util.ArrayList;
import java.util.List;
import prueba.programacion.modelo.Cliente;

/**
 *
 * @author morti
 */
public class ClienteServicio implements IClienteServicio{

    private static List<Cliente> clienteList = new ArrayList<>();

    @Override
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }
    
    public List<Cliente> listar(){
        return this.clienteList;
    }

}
