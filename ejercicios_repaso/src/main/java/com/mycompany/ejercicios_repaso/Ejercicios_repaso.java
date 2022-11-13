package com.mycompany.ejercicios_repaso;

import java.util.Scanner;

/**
 * @author salvador
 */
public class Ejercicios_repaso {

    public static void main(String[] args) {
        menu();

    }//fin main

    public static void menu() {
        boolean bool = true;
        Scanner entrada = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        do {
            System.out.println("--------------------------------------");
            System.out.println("Ingrese su nombre: ");
            String nombre = nom.nextLine();
            System.out.println("Bienvenido al menu " + nombre + "!!!");
            System.out.println(nombre + " estas son las opciones disponibles del menu: ");
            System.out.println("1.Veamos si podemos formar la palabra\n2.Numeros primero\n3.Ordenar Alfabeticamente\n4.Codificar cadena\n5.Jugando con arreglos");
            System.out.println(nombre + " Porfavor elige una opcion disponible:");
            int opc = entrada.nextInt();
            switch (opc) {

                case 1: {
                    palabra();

                }
                break;
                case 2: {
                    numeros();

                }
                break;
                case 3: {
                    Scanner cad = new Scanner(System.in);
                    String cadena;
                    System.out.println("Ingrese una cadena: ");
                    cadena = cad.nextLine();
                    orden(cadena);

                }
                break;
                case 4: {
                    codificacion();

                }
                break;
                case 5: {
                    valores_arreglos();
                    visualizacion_arreglos();

                }
                break;
                default:

                    bool = false;

                    System.out.println(nombre + " La opcion ingresada es invalida, se abandonara el menu");
                    System.out.println(nombre+" Gracias por usar mi programa!!");
                    
                    
            }//  fin case 

        } while (bool != false);//fin while
    }// fin menu

    public static void palabra() {
        Scanner string = new Scanner(System.in);
        System.out.println("Porfavor ingrese una cadena: ");
        String cad1 = string.nextLine();
        System.out.println("Ingrese otra cadena: ");
        String cad2 = string.nextLine();
        int lenght1 = cad1.length();
        int lenght2 = cad2.length();
        if (lenght1 > lenght2) {
            if (cad1.contains(cad2)) {
                System.out.println("si se puede armar " + cad2);

            }//fin contains
        }//fin string1 mayor string2
        else if (lenght1 < lenght2) {
            if (cad2.contains(cad1)) {
                System.out.println("Si se puede armar " + cad1);

            }//fin contains

        }//fin string2 mayor string1 

    }//fin palabra

    public static void numeros() {
        Scanner cad = new Scanner(System.in);
        System.out.println("Ingrese una cadena que contenga numeros y letras\n(ejemplo:laur122car) :");
        String cadmixta = cad.nextLine();
        int len = cadmixta.length();
        int i = 0;
        String letras = "";
        String num = "";
        String caracteres = "";
        String digitos = "";
        do {
            i++;
            if (letras.contains(caracteres)) {
                letras += caracteres;
            }
            if (num.contains(caracteres)) {
                digitos += caracteres;

            }
            System.out.println("Input: " + cadmixta);
            System.out.println("Output: " + digitos + caracteres);

        } while (i < len);//fin while

    }//fin numeros

    public static void orden(String cadena) {

    }//fin orden

    public static void codificacion() {
        Scanner cad_cod = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese una cadena: ");
        String str_cod = cad_cod.nextLine();
        String stringmixta = "azoeofjojfor";
        String output = "";
        int z = 0;
        int len_str_cod = str_cod.length();
        do {
            z++;
            char caracter = str_cod.charAt(z);
            int ascii = (int) caracter;
            if (ascii != 32) {
                if (ascii > 47 || ascii < 58) {
                    String num = Character.toString((char) ascii);
                    int len = stringmixta.length();
                    int i = 0;
                    do {
                        i++;
                        String letra = String.valueOf(stringmixta.charAt(i));
                        if (num.equals(String.valueOf(i + 1))) {
                            output += letra + "-";
                        }
                        break;

                    } while (i < len);//fin while interno
                }
            }
            if (ascii > 96 || ascii < 123) {
                output += String.valueOf(ascii - 96) + "-";

            } else if (ascii == 32) {
                if (output.endsWith("-")) {
                    output = output.substring(0, output.length() - 1);
                }
                output += " ";
            }

            if (output.endsWith("-")) {
                output = output.substring(0, output.length() - 1);
            }

            System.out.println("La entrada es : " + cad_cod);
            System.out.println("La Salida es : " + output);

        } while (z < len_str_cod);//fin while externo
    }//fin codificacion

    public static void valores_arreglos() {
        Scanner valor_array = new Scanner(System.in);
        //int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            int n = valor_array.nextInt();
           // array[i] = valor_array.nextInt();
        }

    }//fin valores arreglos

    public static void visualizacion_arreglos() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("la posicion es: "+(i+1)+"=>"+array[i]);
        }

    }//fin visualizacion arreglos

}//fin clase
