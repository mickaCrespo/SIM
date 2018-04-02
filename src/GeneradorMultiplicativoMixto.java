/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mickaelacrespo
 */
public class GeneradorMultiplicativoMixto {
    
    private int a;
    private int m;
    private int c;
    private int seed;
    private int xi;

//    Constructor
    
    public GeneradorMultiplicativoMixto(int k, int g, int c, int seed) {
        this.a = 1 + 4*k;
        this.m = (int) Math.pow(2,g);
        this.c = c;
        this.seed = seed;
        this.xi = seed;
    }
    
//  Metodos de la clase
 
    private int generarNumeroX(){
        if (first == true){
            this.first = false;
            return this.seed;
        }
        else{
            int x2 = (a*xi + c) % m; 
            return x2;    
        }

    }
    
    public float generarNumeroRandom(){
        this.xi = generarNumeroX(); 
        
        float r = (float) xi / m;
       
       r = truncar(r);
       
       return r;
    }
    
    private float truncar(double valor){
        return new BigDecimal(valor).setScale(4, RoundingMode.DOWN).floatValue();
    }
     
}
