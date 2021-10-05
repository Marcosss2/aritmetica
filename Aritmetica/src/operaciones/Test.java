/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
   
    
   public static void main (String [] args) {
       
       /*Aritmetica arit = new Aritmetica();
       arit.a = 5; 
       arit.b = 7;*/
       Aritmetica arit = new Aritmetica(5,7);
       
       arit.suma();
       var res = arit.suma2();
      System.out.println("res =" + res);
       
  
      res = arit.sumaArgs(8, 9);
       System.out.println("res = " + res);
   
    nuevoMetodo();
    
   
   
   } 
    
   public  static void nuevoMetodo(){
       
        System.out.println("nuevo metodo ");
       
   } 
  
   
   
   
   
}
