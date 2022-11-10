/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8eje6;

import Servicios.AlmacenService;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia8Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // . Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
//productos que venderemos y el precio que tendrán. Además, se necesita que la 
//aplicación cuente con las funciones básicas. 
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
//Realizar un menú para lograr todas las acciones previamente mencionadas. 

        HashMap<String, Double> listaProductos = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        AlmacenService as = new AlmacenService();
        int op= 0;
        
        do {
            
        System.out.println("MENU");
        System.out.println("1. CARGAR PRODUCTO");
        System.out.println("2. MODIFICAR PRECIO");
        System.out.println("3. ELIMINAR PRODUCTO");
        System.out.println("4. IMPRIMIR LISTA");
        System.out.println("5. SALIR");
        
        op=leer.nextInt();
        
        
          
        switch(op){
            
            case 1: as.cargarproducto(listaProductos);
            break;
            case 2: as.modificarPrecio(listaProductos);
            break;
            case 3: as.borrarProducto(listaProductos);
            break;
            case 4: as.imprimirLista(listaProductos);
            break;
            
           } 
            
            
        }while (op!=5); 
        
        
    }

}
