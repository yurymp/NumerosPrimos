/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author Yury --> para varias líneas de código
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // para una sola línea de código utilizo doble back slash
        //tipos de datos primitivos

        /**
         * System.out.println("Hola mundo");
         *
         * int miVariableEntera;
         *
         * //¿Qué falta? miVariableEntera = 10;
         *
         * //concatenación de cadena System.out.println("El valor de mi
         * variable entera es: " + miVariableEntera);
         *
         * byte miVariableEntera2 = 25;
         *
         * System.out.println("El valor de mi variable entera es: " +
         * miVariableEntera2);
         *
         * short miVariableEntera3 = 65;
         *
         * System.out.println("El valor de mi variable entera es: " +
         * miVariableEntera3);
         *
         * long miVariableEntera4 = 65478;
         *
         * System.out.println("El valor de mi variable entera es: " +
         * miVariableEntera4);
         *
         * //Números decimales float miVariableDecimal1 =2.56f;
         * System.out.println("El valor de mi variable decimal es: " +
         * miVariableDecimal1);
         *
         * //Caracteres char masculino = 'M';
         *
         * System.out.println("El caracter para Masculino es: " + masculino);
         *
         * boolean decision = false; //se implementan mucho en condicionales
         *
         * System.out.println("La nota para todos hoy es 5.0: " + decision);
         *
         * //Cambiar valor de la variable se puede redefinir y reutilizar
         * miVariableEntera = 15;
         *
         * //utilizar var para inferir el tipo de dato
         *
         *
         * //tipos de datos primitivos
         *
         * String hola = "Hola, soy yury";
         *
         * int $condolar = 15; int _conguion = 45;
         *
         * String hola2 = "Soy la profesora";
         *
         * System.out.println(hola + hola2); *
         *
         * //concatenar el valor de una variable string y númerica //si de
         * izquierda a derecha encontramos números, ser realiza la suma
         * System.out.println($condolar+_conguion+hola2); //de izquierda a
         * derecha se evalúan las expresiones
         * System.out.println(hola2+$condolar+_conguion); //contexto cadena, si
         * primero encuentra cadena, todo lo demas será cadena
         * System.out.println(hola2+($condolar+_conguion)); //los parentesis
         * tienen un orden de prioridad mayor
         *
         * // caracteres de escape en Java String saludo = "hola estudiantes de
         * lenguajes";
         *
         * System.out.println("nueva línea: \n" + saludo);
         * System.out.println("tabulador:\t " + saludo);
         * System.out.println("retroceso1: \b" + saludo);
         * System.out.println("retroceso2:\b\b " + saludo);
         * System.out.println("retroceso:\b\b " + saludo);
         * System.out.println("nueva línea: (" + saludo + ")");
         * System.out.println("retroceso1: \'" + saludo + "\'");
         * System.out.println("retroceso1: \"" + saludo + "\"");
         *
         *
         * //Clase scanner //si yo quisiera que fuera por consola como sería?
         * String usuario = "Yury"; System.out.println(usuario);
         *
         * System.out.println("Escriba su nombre:"); //System es una clase en
         * Java que nos permite acceder a la consola //in = input //se debe
         * importar Scanner leerInfo = new Scanner(System.in); //nextLine es uno
         * de los metodos más utilizados para leer datos de la consola String
         * estudiante = leerInfo.nextLine(); System.out.println("Estudiante = "
         * + estudiante); System.out.println("ingresar un numero"); int a =
         * leerInfo.nextInt(); System.out.println("el valor es: " + a);
         *
         * //ejercicio: recibir dos numeros por consola y sumarlos int b =
         * leerInfo.nextInt(); System.out.println("el valor es: " + b);
         *
         * int suma = a + b; System.out.println("suma es:" + suma);
         *
         * float z = 2.58F; float k = 5F;
         *
         * //CONVERTIR STRING A ENTERO int edad = Integer.parseInt("20");
         *
         *
         * Scanner conversor = new Scanner(System.in);
         * System.out.println("proporciona tu edad"); int conversor1 =
         * Integer.parseInt(conversor.nextLine());
         * System.out.println(conversor1);
         *
         *
         *
         * //JAVA MATH Math.min(k, z);
         *
         * System.out.println(Math.min(k, z));
         * System.out.println(Math.sqrt(64));
         *
         * float s = 2.58F; float c = 5F; if(c > s){ System.out.println("10 es
         * mayor que 5"); }
         *
         *
         * //numeros primos System.out.println("Números primos");
         * System.out.println("Ingrese el número a evaluar"); Scanner a = new
         * Scanner(System.in); int b; b = a.nextInt(); if (b > 1) {
         * System.out.println("el numero ingresado es un número natural"); int
         * co = 0; for (int i = 2; i <= b; i++) { if (b % i == 0) { co = co + 1;
         * } } if (co == 1) { System.out.println("El número es primo"); } else {
         * System.out.println("El número no es primo"); } } else {
         * System.out.println("Ingrese un número mayor que 1"); }
         */
        //validar si una persona es mayor de edad
        int edad = -1;

        if (edad < 18 && edad >= 0) {
            System.out.println("La persona es menor de edad");
        } else if (edad >= 18) {
            System.out.println("es mayor de edad");
        } else //throw new ArithmeticException("Ingrese una edad válida");
        {
            System.out.println("Ingrese una edad válida");
        }

        System.out.println(esMayorDeEdad(edad));
        System.out.println(valorAbsoluto(-5));

        for (int i = 0; i < edad; i++) {
            System.out.println(i);
        }

        System.out.println("Por favor ingresar 5 números enteros");
        int para = 5;
        int conMayor = 0;
        int conMenor = 0;
        int igualCero = 0;

        for (int j = 0; j < 5; j++) {
            Scanner a = new Scanner(System.in);
            int b = a.nextInt();
            if (b > 0) {
                conMayor += 1;
            } else if (b < 0) {
                conMenor += 1;
            } else {
                igualCero += 1;
            }
        }
        System.out.println(conMayor);
        System.out.println(conMenor);
        System.out.println(igualCero);

        //switch
        int dia = 1;

        for (int d = 1; d <= 3; d++) {
            switch (d) {
                case 1:
                    System.out.println("El día de hoy es lunes porque dia = " + d);
                    break;
                case 2:
                    System.out.println("El día de hoy es martes");
                    break;
                //¿qué pasa si el usuario ingresa el 8?
                default:
                    System.out.println("El valor del día ingresado no está entre 1 y 7");

            }
        }

        System.out.println("switch solo");

        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                break;
            }
            System.out.println(j);
        }

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los dos números del rango");
        int a = leer.nextInt();
        int b = leer.nextInt();
        System.out.println(a);
        System.out.println(b);
        int menor;
        int mayor;

        if (a < b) {
            menor = a;
            mayor = b;
        } else {          
            menor = b;
            mayor = a;
        }
        
        while (menor <= mayor) {
            if (menor % 2 == 0) {
                System.out.println(menor);
            }

            menor++;
        }
        
        //divisores de un número, los divisores de 12 son: 1, 2, 3, 4, 6, 12
        System.out.println("sumatoria de los divisores");
        int sumaDivisores = 0;
        for( int h = 1; h <= 12; h++){
            if(12%h == 0){
                sumaDivisores = sumaDivisores + h;
            }
        }
        System.out.println(sumaDivisores);

    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    // Defina el metodo valor absoluto.
    public static int valorAbsoluto(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    // Defina un metodo que determine si un entero es primo o no.
    public static boolean esNumeroPrimo(int y) {
        if (y > 0) {
            for (int i = 2; i < y; i++) {
                if (y % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            throw new ArithmeticException("y debe ser un numero natural");
        }
    }

    public static boolean esNumeroPrimo2(int y) {
        if (y <= 0) {
            throw new ArithmeticException("y debe ser un numero natural");
        }

        for (int i = 2; i < y; i++) {
            if (y % i == 0) {
                return false;
            }
        }

        return true;
    }

}
