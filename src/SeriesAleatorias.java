
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michel
 */
public class SeriesAleatorias {
    
    public SeriesAleatorias(){}
    
    public float[] serieAleatoria(int numeros){
        Random rnd = new Random();
        float[] v = new float[numeros];
        float x;

        for (int i = 0; i < numeros; i++) {
        	x = (float)(rnd.nextFloat());
                v[i]=x;
    	}
        return v;
    }
    
    
    public float[] transformarAFloat(String[] vector){
    float[] v = new float[vector.length];
    for (int i=0; i<vector.length;i++){
        v[i] = Float.parseFloat(vector[i]); 
    }
    return v;
    }
    
}
