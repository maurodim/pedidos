/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author mauro
 */
public class DetallePedidos extends Pedidos{
    private Double cantidad;
    private Integer idArticulo;
    private String descripcionArticulo;
    private Double precioUnitario;
    private Double montoIva;
    private int tipoIva;
    private String descripcionIva;
    private Double totalItems;
    private Double subTotalItems;
    private int idPedido;
    private Integer idRemito;
    
    
    
    public DetallePedidos() {
        super();
    }
    public DetallePedidos(Boolean instalar) {
        super(instalar);
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getMontoIva() {
        return montoIva;
    }

    public void setMontoIva(Double montoIva) {
        this.montoIva = montoIva;
    }

    public int getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(int tipoIva) {
        this.tipoIva = tipoIva;
    }

    public String getDescripcionIva() {
        return descripcionIva;
    }

    public void setDescripcionIva(String descripcionIva) {
        this.descripcionIva = descripcionIva;
    }

    public Double getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Double totalItems) {
        this.totalItems = totalItems;
    }

    public Double getSubTotalItems() {
        return subTotalItems;
    }

    public void setSubTotalItems(Double subTotalItems) {
        this.subTotalItems = subTotalItems;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public Integer getIdRemito() {
        return idRemito;
    }

    @Override
    public void setIdRemito(Integer idRemito) {
        this.idRemito = idRemito;
    }

    
    
    
}
