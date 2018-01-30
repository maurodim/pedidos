/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import interfaces.Pedidable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mauro
 */
public class Pedidos implements Pedidable{
    private Integer id;
    private Integer idCliente;
    private String nombreCliente;
    private int tipo;
    private String numeroPedido;
    private Integer idFactura;
    private int estado;
    private Double subTotal;
    private Double iva;
    private Double total;
    private Date fecha;
    private Integer idRemito;

    public Integer getIdRemito() {
        return idRemito;
    }

    public void setIdRemito(Integer idRemito) {
        this.idRemito = idRemito;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
    
    public Pedidos(Boolean instalar) {
        if(instalar){
            String sql="CREATE TABLE pedidos (\n" +
"  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,\n" +
"  id_clientes INTEGER(11) NOT NULL,\n" +
"  total DOUBLE NULL,\n" +
"  tipo INTEGER UNSIGNED NULL DEFAULT 0,\n" +
"  numero VARCHAR NULL DEFAULT 0,\n" +
"  idfactura INTEGER UNSIGNED NULL DEFAULT 0,\n" +
"  estado SMALLINT UNSIGNED NULL,\n" +
"  subtotal DOUBLE NULL,\n" +
"  iva DOUBLE NULL,\n" +
"  fecha TIMESTAMP NULL,\n" +
"  idusuario SMALLINT UNSIGNED NULL,\n" +
"  PRIMARY KEY(id),\n" +
"  INDEX pedidos_index3135(id_clientes)\n" +
");";
            
        }
    }

    public Pedidos() {
    }

    @Override
    public Integer guardarPedido(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean modificarPedido(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminarPedido(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listarPedidosPorFechas(String fechaDesde, String fechaHasta, Integer idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listarPedidosPorClientes(Integer idCliente, int estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList cargarPedidoPorId(Integer idPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComboBoxModel mostrarArrayEnCombo(ArrayList listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object cargarObjetoDeListado(int posicion, ArrayList listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TableModel mostrarArrayEnTabla(ArrayList listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object convertirEnFactura(Object pedid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
