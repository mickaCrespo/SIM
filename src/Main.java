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
        // TODO code application logic here
        
        //código para probar método sonCoprimos
        
        GeneradorMultiplicativoMixto gen = new GeneradorMultiplicativoMixto(3, 3, 7, 6);
        if (gen.sonCoprimos(20, 73)){
            System.out.println("son coprimos");
        }
        else {
            System.out.println("no son coprimos");
        }
        float r = gen.generarNumeroRandom();
        System.out.println(String.format("r: %.4f", r));
        r = gen.generarNumeroRandom();
        System.out.println(String.format("r: %.4f", r));
        r = gen.generarNumeroRandom();
        System.out.println(String.format("r: %.4f", r));
        // esto lo use un rato para poder imprimir una serie de 20 numeros, y el while del ultimo para ir agregando de a uno.
        float[] serie = gen.serie(20);        
        for  (int x=0; x<serie.length; x++){
        System.out.println("N° "+(x+1)+": "+String.format("%.4f", serie[x]));}
        //System.out.print("Presionar ENTER para observar el siguiente valor..");
        String s = sc.nextLine();
        int x = serie.length+1;
        while (!(s == null) && (s.equals(""))){
            serie = gen.serie(21);
            System.out.println("N° "+(x)+": "+String.format("%.4f", serie[0])+": ");
            x++;
            s = sc.nextLine();
        }
    }
    
}
