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
    }
    
}
