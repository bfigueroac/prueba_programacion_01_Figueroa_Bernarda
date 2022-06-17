/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prueba.programacion.servicio;

import java.util.List;
import prueba.programacion.modelo.Cliente;

/**
 *
 * @author morti
 */
public interface IClienteServicio {
    
    public Cliente crear(Cliente cliente);
    public List<Cliente> listar();   
    
}
