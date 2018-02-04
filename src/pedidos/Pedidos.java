/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import Configuracion.Propiedades;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pantallas.IngresoDePedidos;

/**
 *
 * @author mauro
 */
public class Pedidos {
    public static ArrayList listadoCompobrantes;
    public static int idUsuario;
    public static int idSucursal;
    public static int idDeposito;
    public static Integer idCaja;
    public static String nombreUsuario;
    public static String fechaDia;
    
    /**
     * @param args the command line arguments
     * 0 - instala/actualiza base
     * 1- idUsuario
     * 2- idSucursal
     * 3- idDeposito
     * 4- idCaja
     * 5- nombreUsuario
     * 6- fechacomprobante
     */
    public static void main(String[] args) {
        System.out.println(args[0]);
        try {
            Propiedades.CargarPropiedades();
        } catch (ParseException ex) {
            Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        listadoCompobrantes=new ArrayList();
        listadoCompobrantes.add(1);
        listadoCompobrantes.add(2);
        idUsuario=Integer.parseInt(args[1]);
        idSucursal=Integer.parseInt(args[2]);
        idDeposito=Integer.parseInt(args[3]);
        idCaja=Integer.parseInt(args[4]);
        nombreUsuario=args[5];
        fechaDia=args[6];
        IngresoDePedidos ing=new IngresoDePedidos();
        ing.setVisible(true);
        ing.pack();
        ing.toFront();
        
    }
    
}
