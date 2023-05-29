
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Royvin Arrieta M.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salir=7;
        Recursividad recursividad = new  Recursividad();
        while(salir ==7){
            int menuOpcion = Integer.parseInt(JOptionPane.showInputDialog
            ( "1.Ejercicio 1" + "\n"
            + "2.Ejercicio 2" + "\n"
            + "3.Ejercicio 3" + "\n"
            + "4.Ejercicio 4" + "\n"
            + "5.Ejercicio 5" + "\n"
            + "6.Ejercicio 6" + "\n"
            + "7.SALIR" + "\n"));
            
            switch(menuOpcion){
                case 1:
                    int num= Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite el numero que desea invertir: "));
                    int cifraInvertida = recursividad.InvertirCifras(num);
                    JOptionPane.showMessageDialog
                    (null,"El numero invertido de "+ num + " es\n" 
                            + cifraInvertida);
                    break;
                    
                case 2:
                    String mensaje = JOptionPane.showInputDialog
                    ("Digite el mensaje: ");
                    recursividad.imprimir(mensaje);
                    break;
                    
                case 3:
                    int []vec;
                    int cantidadNumeros = Integer.parseInt
                    (JOptionPane.showInputDialog("Digite la cantidad "
                            + "de numeros que desea generar: "));
                    vec = new int [cantidadNumeros];
                    recursividad.llenarVector(vec);
                    
                    break;
                    
                case 4:
                    int numero = Integer.parseInt
                    (JOptionPane.showInputDialog
                    ("Digite Numero mayor a 0 para la suma recursiva: "));
                    JOptionPane.showMessageDialog
                    (null, "El de la suma recursiva de "+ numero 
                            + "\n" +recursividad.sumaNumeros(numero));
                    
                    break;
                    
                case 5:
                    int numeroTabla = Integer.parseInt
                    (JOptionPane.showInputDialog
                    ("Digite el numero de la tabla que desea saber: "));
                    recursividad.mostrarTablas(numeroTabla);
                    break;
                    
                case 6:
                    int numeroSuma = Integer.parseInt
                    (JOptionPane.showInputDialog
                    ("Digite los digitos del numero que desea sumar:"));
                    JOptionPane.showMessageDialog(null, "La suma de los digitos de " 
                    + numeroSuma+ " es\n" + recursividad.sumaDigitos(numeroSuma));
                    break;
                    
                case 7:
                    salir = 0;
                    break;
            }
        }
    }
    
}
