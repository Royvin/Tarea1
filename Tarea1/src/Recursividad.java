
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Royvin Arrieta M.
 */
public class Recursividad {
    
    //EJERCICIO #1
    public int InvertirCifras(int num){
        if(num==0){
            return 0;
        }
        else{
            return InvertirCifrasR(num, 0, 0);
        }
    }
    
    private int InvertirCifrasR(int num, int cifra, int nuevaCifra){
        if(num != 0){
            cifra = num%10;
            nuevaCifra = (nuevaCifra * 10) + cifra;
            return InvertirCifrasR(num/=10, cifra, nuevaCifra);
        }
        return nuevaCifra;
    }
    
    //EJERCICIO #2
    public void imprimir(String mensaje){
        if(mensaje.length()==0){
            JOptionPane.showMessageDialog
        (null, "No existe ningun mensaje que imprimir");
        }else{
            imprimirR(mensaje,0);
        }
    }
    
    private void imprimirR(String mensaje, int i){
        if(i < mensaje.length()){
            JOptionPane.showMessageDialog(null, mensaje.charAt(i));
            imprimirR(mensaje, i+1);
        }
    }
    
    //EJERCICIO 3
    public void llenarVector(int [] vector){
        llenarVectorR(vector, 0, "", 0);  
    }
    
    private void llenarVectorR 
        (int [] vector, int i,String numerosVector, int numeroMayor){
        if(i < vector.length){
            vector[i]=(int) (Math.random()*99)+1;
            numerosVector+=vector[i] + "  ";
            if(vector[i] > numeroMayor){
                numeroMayor = vector[i];
                
            }
            llenarVectorR(vector, i+1, numerosVector, numeroMayor);
            
        }else{
            JOptionPane.showMessageDialog
        (null, "Los numeros del vector son: \n" + numerosVector 
                + "\nEl numero mayor del vector es: \n" + numeroMayor) ;
        }
        
        
    }
        
    //EJERCICIO 4
   public int sumaNumeros(int i){
       if(i == 0){
           return 0;
       }
       else{
           return sumaNumerosR(i);
       }
       
   }
   
   private int sumaNumerosR(int i){
        if (i == 1){
            return 1;
        }else{
            return i+sumaNumerosR(i-1);
        }
    }
   
   //EJERCICIO 5
   public void mostrarTablas(int numero){
      mostrarTablasR(numero, 1, ""); 
   }
   
   private void mostrarTablasR(int numero, int i, String resultado){
       if (i <= 10){
           resultado += numero + "x" + i + " = " + numero*i + "\n";
           mostrarTablasR(numero, i+1 ,resultado);
       }else{
           JOptionPane.showMessageDialog(null,"La tabla del "+ numero + " es: \n" + resultado);
       }
           
       
   }
   
   //EJERCICIO 6
   public int sumaDigitos(int numero){
       if(numero <= 0){
           return 0;
       }else{
           return sumaDigitosR(numero, 0, 0);
       }
   }
   
   
   private int sumaDigitosR (int numero, int digitos, int result){
       if(numero != 0){
           digitos = numero % 10;
           result = result + digitos;
           return sumaDigitosR(numero/10, digitos, result); 
       }else{
           return result;
       }
       
   }
   
        
        
}
