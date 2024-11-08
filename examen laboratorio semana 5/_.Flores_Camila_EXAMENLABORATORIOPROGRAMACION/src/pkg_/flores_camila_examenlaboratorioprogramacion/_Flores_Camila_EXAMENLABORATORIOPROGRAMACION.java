/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg_.flores_camila_examenlaboratorioprogramacion;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class _Flores_Camila_EXAMENLABORATORIOPROGRAMACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0, contador = 0, suma = 0;
        String nombreC, tipoC, tipoCaja;
        double subtotal = 0, totalpagar, impuesto;
        String TipoC; 
        int canalHD = 0;
        int Normales = 0, HD = 0;
        
        int mayor = 0;
        String Respuesta = null;

        while (opcion != 5) {
            System.out.println("""
                               Seleccione una de las siguientes opciones: 
                               1. PIRAMIDES
                               2. EL MAYOR
                               3. VENTAS
                               4. CARACTERES VOCALES
                               5. Salir""");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    System.out.println("Corriendo programa de piramides:");
                    ///codigo sjshdjfh

                case 2 -> {
                    System.out.println("Ingrese un numero del 1 al 1000");
                    while (true) {
                        int numero = entrada.nextInt();
                        entrada.nextLine();

                        if (contador == 0) {
                            mayor = numero;
                        } else if (numero > mayor) {
                            mayor = numero;
                        }
                        suma += numero;
                        contador++;

                        System.out.println("Desea continuar? (S/N)");
                        Respuesta = entrada.nextLine();

                        if ("n".equalsIgnoreCase(Respuesta)) {
                            break;
                        }
                    }

                    if (contador > 0) {
                        double promedio = (double) suma / contador;
                        System.out.println("El numero mayor es: " + mayor);
                        System.out.println("El promedio es: " + promedio);
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre del cliente");
                    String nombre = entrada.next();
                    
                    while(true){
                        System.out.println("Ingrese que tipo de canal desea: 'HD' o 'Normal'");
                         TipoC = entrada.next().toUpperCase();
                        
      
                        if( "HD".equals(TipoC)){
                        canalHD++;
                        subtotal =+30;     
                    }else if ("normal".equals(TipoC)) {
                        Normales++;
                        subtotal +=20;
                     }

                       
                        System.out.print("Desea ingresar otro canal? (S/N): ");
                        String respuestas = entrada.nextLine().toUpperCase();
                        if ("NO".equals(respuestas)) {
                            break;
                     }
                        System.out.println("Ingrese cual quiere: 'LIGHTBOX', 'HDBOX' o 'DVRBOX'");
                        tipoCaja = entrada.next().toUpperCase();
                        
                        double costocaja = 0;
                        
                        if("LIGHTBOX".equals(tipoCaja)){
                            costocaja =50;
                        }else if ("HDBOX".equals(tipoCaja)){
                            costocaja = 100;
                        }else if ("DVRBOX".equals(tipoCaja)){
                            costocaja = 150;
                        }
                        subtotal += costocaja;
                        impuesto = subtotal * 0.15;
                        
                        totalpagar = subtotal + impuesto;
                        
                        System.out.println("Dettales:");
                        System.out.println("el cliente " + nombre);
                        System.out.println("canaes normales fueron " + Normales);
                        System.out.println("canales HD " + HD);
                        System.out.println("su subtotal es " + subtotal);
                        System.out.println("impuesto del 15% es de " + impuesto);
                        System.out.println("su pago total es de " + totalpagar);
                        
                } 
                } 
                case 4 -> {
                    System.out.println("Ingrese una palabra:");
                    String palabra = entrada.next();  

                    int contadorvocales = 0;

                    for (int i = 0; i < palabra.length(); i++) {
                        char letra = palabra.charAt(i);

                       
                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                contadorvocales++;
                                break;
                            default:
                                break;
                        }
                    }
                    System.out.println("Esta palabra tiene " + contadorvocales + " vocales.");
                }               
                case 5 -> {
                System.out.println("Hasta luego.....saliendo");
                }
                
                }
            }
        }
    }


