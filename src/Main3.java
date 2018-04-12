/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Michel
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //código para probar método sonCoprimos
        
//        GeneradorMultiplicativoMixto gen = new GeneradorMultiplicativoMixto(3, 3, 7, 6);
//        if (gen.sonCoprimos(20, 73)){
//            System.out.println("son coprimos");
//        }
//        else {
//            System.out.println("no son coprimos");
//        }
//        float r = gen.generarNumeroRandom();
//        System.out.println(String.format("r: %.4f", r));
//        r = gen.generarNumeroRandom();
//        System.out.println(String.format("r: %.4f", r));
//        r = gen.generarNumeroRandom();
//        System.out.println(String.format("r: %.4f", r));
//        // esto lo use un rato para poder imprimir una serie de 20 numeros, y el while del ultimo para ir agregando de a uno.
//        float[] serie = gen.serie(20);        
//        for  (int x=0; x<serie.length; x++){
//            System.out.println("N° "+(x+1)+": "+String.format("%.4f", serie[x]));
//        }
//        //System.out.print("Presionar ENTER para observar el siguiente valor..");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int x = serie.length+1;
//        while (!(s == null) && (s.equals(""))){
//            serie = gen.serie(21);
//            System.out.println("N° "+(x)+": "+String.format("%.4f", serie[0])+": ");
//            x++;
//            s = sc.nextLine();
//        }



//              ESTO ES UN MENÚ PEDORRO, NO SE ASUSTEN JAJA
        Scanner scan = new Scanner("System.in");
        System.out.println("Opción 1: generar números aleatorios\nOpcion 2: prueba chi cuadrado\n0: Salir");
        BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
        int op = Integer.parseInt(brd.readLine());
        while (op != 0){
            System.out.println("Opción 1: generar números aleatorios\nOpcion 2: prueba chi cuadrado\n0: Salir");
            op = Integer.parseInt(brd.readLine());
            switch (op){
                case 1: 
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Ingrese los parámetros del generador: ");
                // PEDIR PARÁMETROS
                    Generador gen = new Generador(13, 7, 8, 6);
                    float v1[] = gen.generarSerie(8);
                    String a = "";
                    System.out.println("Los números generador fueron: " + Arrays.toString(v1));
                    System.out.println("\n\nPresione enter para ver otro número o ingrese una letra para salir\n");
                    a = br.readLine();
                    while (a.equals("")){
                       System.out.println("Siguiente número: " + gen.generarNumeroRandom() + " \n");
                       a = br.readLine();
                    }
                    break;
                case 2: 
//                      HAY QUE HACER LA PRUEBA AL GENERADOR DEL LENGUAJE
                    float v[] = new float[30];
                    v[0] = 0.15f;
                    v[1] = 0.22f;
                    v[2] = 0.41f;
                    v[3] = 0.65f;
                    v[4] = 0.84f;
                    v[5] = 0.81f;
                    v[6] = 0.62f;
                    v[7] = 0.45f;
                    v[8] = 0.32f;
                    v[9] = 0.07f;
                    v[10] = 0.11f;
                    v[11] = 0.29f;
                    v[12] = 0.58f;
                    v[13] = 0.73f;
                    v[14] = 0.93f;
                    v[15] = 0.97f;
                    v[16] = 0.79f;
                    v[17] = 0.55f;
                    v[18] = 0.35f;
                    v[19] = 0.09f; 
                    v[20] = 0.99f;
                    v[21] = 0.51f;
                    v[22] = 0.35f;
                    v[23] = 0.02f;
                    v[24] = 0.19f;
                    v[25] = 0.24f;
                    v[26] = 0.98f;
                    v[27] = 0.10f;
                    v[28] = 0.31f;
                    v[29] = 0.17f;
                    ChiCuadrado chi = new ChiCuadrado(v, 10);
                    boolean resultado = chi.calcularChiCuadrado();
                    if (resultado) {System.out.println("\nPasó la prueba correctamente\n");}
                    else {System.out.println("No pasó la prueba\n");}
                    System.out.println("Las frecuencias observadas fueron: \n\n");
                    System.out.println(Arrays.toString(chi.frecuenciasObservadas) + "\n");
                    break;               
            }
        }

        
        
    }
    
    
}
