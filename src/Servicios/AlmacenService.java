/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class AlmacenService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarproducto(HashMap<String, Double> p){
        
        String Marca;
        Double Precio;
        String aux;
       
        do {
        System.out.println("Ingrese una marca");
        Marca=leer.next();
        System.out.println("Ingrese el precio");
        Precio=leer.nextDouble();
        
        p.put(Marca, Precio);
        
            System.out.println("Desea agregar otro producto S/N");
            aux=leer.next();
        } while (aux.equalsIgnoreCase("S"));
        
    }
    
    public void modificarPrecio(HashMap<String, Double> m){
        
        String aux="";
        Double precion;
        
        
        System.out.println("Ingrese la marca del producto que desea modificar su precio");
        aux=leer.next();
        System.out.println("Ingrese el precio nuevo");
        precion=leer.nextDouble();
        
    
            if(m.containsKey(aux)){
                
              m.replace(aux, precion);
                
            }
          

    }
    
    public void imprimirLista(HashMap<String, Double> l){
        
         for (Map.Entry<String, Double> entry : l.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Marca: " + key + " Precio: $" + value );
        }
        
        
    }
    
    public void borrarProducto(HashMap<String, Double> b){
        
        String aux="";
       
        System.out.println("Ingrese la marca a eliminar");
        aux=leer.next();
       
            if(b.containsKey(aux)){
                
               b.remove(aux);
                
            }
        
    }
    
}
