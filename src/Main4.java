/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 *
 * @author Michel
 */
public class Main4 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Generador gen = new Generador(19, 33, 100, 37);
        if (gen.sonCoprimos(20, 73)){
            System.out.println("son coprimos");
        }
        else {
            System.out.println("no son coprimos");
        }
        float v1[] = gen.generarSerie(20);
        String a = "";
        System.out.println("Los números generador fueron: " + Arrays.toString(v1));
        System.out.println("\n\nPresione enter para ver otro número o ingrese una letra para salir\n");
        a = br.readLine();
        while (a.equals("")){
            System.out.println("Siguiente número: " + gen.generarNumeroRandom() + " \n");
            a = br.readLine();
                    }
    }
    
}
