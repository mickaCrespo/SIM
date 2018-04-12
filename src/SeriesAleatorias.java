
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
    
    public double[] serieAleatoria2(int numeros){
        Random rnd = new Random();
        double[] v = new double[numeros];
        float x;

        for (int i = 0; i < numeros; i++) {
        	x = (rnd.nextFloat());
                v[i]=x;
    	}
        return v;}
    
    
    public float[] transformarAFloat(String[] vector){
    float[] v = new float[vector.length];
    for (int i=0; i<vector.length;i++){
        v[i] = Float.parseFloat(vector[i]); 
    }
    return v;
    }
    
    public int frecuenciaEsperada(float[] vector, int intervalos){
        int n = vector.length;
        while (n/intervalos < 5){
            intervalos = (int) (intervalos)/2;
//            intervalos -= 1;
        }
        return (int) (n/intervalos);
    }

    public int[] dameFrecuenciasO(float[] vector, int intervalos){
        int[] frecuenciasObservadas2 = new int[intervalos];
        for (int i=0; i < vector.length; i++){
            int x = (int) ((vector[i] / frecuenciaEsperada(vector, intervalos)) * vector.length );
            //frecuenciasObservadas[x] += 1;
            frecuenciasObservadas2[x]++;    
    }
    return frecuenciasObservadas2;}
}
