import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mickaelacrespo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeneradorMultiplicativoMixto gen = new GeneradorMultiplicativoMixto(3, 3, 7, 6);
        if (gen.sonCoprimos(20, 73)){
            System.out.println("son coprimos");
        }
        else {
            System.out.println("no son coprimos");
        }
        float[] serie = gen.serie(999);        
        for  (int x=0; x<20; x++){
        System.out.println("N° "+(x+1)+": "+String.format("%.4f", serie[x]));}
        int y = 20;
        String s = sc.nextLine();
        while (!(s == null) && (s.equals(""))){
            System.out.println("N° "+(y+1)+": "+String.format("%.4f", serie[y])+": ");
            y++;
            s = sc.nextLine();
        }
    }
}
 

