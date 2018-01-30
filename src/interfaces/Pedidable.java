/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mauro
 */
public interface Pedidable {
    public Integer guardarPedido(Object objeto);
    public Boolean modificarPedido(Object objeto);
    public Boolean eliminarPedido(Object objeto);
    public ArrayList listarPedidosPorFechas(String fechaDesde,String fechaHasta,Integer idCliente);
    public ArrayList listarPedidosPorClientes(Integer idCliente,int estado);
    public ArrayList cargarPedidoPorId(Integer idPedido);
    public ComboBoxModel mostrarArrayEnCombo(ArrayList listado);
    public Object cargarObjetoDeListado(int posicion,ArrayList listado);
    public TableModel mostrarArrayEnTabla(ArrayList listado);
    public Object convertirEnFactura(Object pedid);
}
