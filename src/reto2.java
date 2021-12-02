/*
 Tecnicas de programación y laboratorio
 Reto 2
 Samuel Acevedo && Efraín García
*/


import java.util.Scanner;

public class reto2 {

    public static void main(String[] args) {

        while(true){

            System.out.println("\n1. Tablas de multiplicar");

            System.out.println("2. Cuadrado de los N primeros enteros");

            System.out.println("3. Cubos de Nicomaco");

            System.out.println("4. Cajero automático");

            System.out.println("5. Salir del sistema");


            System.out.print("\n Seleccione una funcionalidad del programa(Escriba el numero que la identifica: ");

            Scanner eleccion = new Scanner(System.in);
            String k = eleccion.nextLine();

            switch(k){
                case "1":
                    punto1();
                    break;
                case "2":
                    punto2();
                    break;
                case "3":
                    punto3();
                    break;
                case "4":
                    punto4();
                    break;
                case "5":
                    System.out.println("Cerrando programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        }
    }

    public static void punto1(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de las tablas que quiere conocer: ");
        int N = leer.nextInt();
        System.out.println("Número hasta el que quiere que vaya la tabla: ");
        int M = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Tabla del " + i + " desde 1 hasta " + M);
            for (int j = 1; j <= M; j++) {
                int respuesta = i * j;
                System.out.println(i + "x" + j + "=" + respuesta);
            }
        }
    }
    public static void punto2(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora de números cuadrados!");
        System.out.println("Ingrese el número hasta el que quiere calcular los cuadrados: ");
        int N= leer.nextInt();
        int sumaimpares=0;
        StringBuilder sucesion= new StringBuilder();

        //Cuadrados de los N primeros enteros

        for(int i=1; i<=N;i++){
            int impar = 2*i-1;
            sumaimpares += impar;
            String intermedio;
            if(impar==1){
                intermedio="";
            }
            else{
                intermedio="+";
            }
            sucesion.append(intermedio).append(impar);
            System.out.println(i+" al cuadrado"+" = "+ sucesion +" = "+sumaimpares);
        }
    }
    public static void punto3(){

        System.out.println("Introduzca un número");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        int i = 1;

        while (i <= n) {
            StringBuilder result = new StringBuilder();
            int firstOdd = ((i-1)*i)+1;
            int sum = firstOdd;
            int j = 1;
            result.append(firstOdd);

            while (j < i){
                int nextOdd = firstOdd + (2*j);
                sum += nextOdd;
                result.append("+").append(nextOdd);
                j++;
            }

            System.out.println(i + "^3" + "=" + result + "=" + sum);
            i++;

        }


    }
    public static void punto4(){
        Scanner retiro = new Scanner(System.in);


        System.out.println("Ingrese valor a retirar: ");


        int n = retiro.nextInt();
        int[] divisor = {100000,50000,20000,10000,5000,2000,1000,500,200,100,50};   //Array con el número de denominaciones de billetes de mayor a menor
        int modulo;
        int resultado;

        System.out.println("Se le entregará repartido de la siguiente manera");

        for(int denominaciones:divisor){        //uso un for each para navegar por el array
            resultado = Math.floorDiv(n,denominaciones);    //Redondea al entero de abajo mas cercano
            modulo = n%denominaciones;

            if(denominaciones<=500){
                System.out.println(resultado + " monedas de "+denominaciones);
            }else{
                System.out.println(resultado + " billetes de "+denominaciones);
            }
            n = modulo;     //Vuelvo a dividir y sacar módulo con lo que me sobró de plata en la operación

        }
    }

}

