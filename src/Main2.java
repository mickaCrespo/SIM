/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Michel
 */
public class Main2 {
    
    public static void main(String[] args) {
        SeriesAleatorias sa = new SeriesAleatorias();
        String[] v = new String[40];
        float[] vec = new float[40];
        vec = sa.serieAleatoria(40);
        int[] frecuencias = sa.dameFrecuenciasO(vec, 8);


        for (int i = 0; i<vec.length;i++){
            System.out.println(vec[i]);
        }
        
        
        for (int i = 0; i<frecuencias.length;i++){
            System.out.println(frecuencias[i]);
        }
        
        float a = 25.0f;
        String b = "235";
        float c = Float.parseFloat(b);
        System.out.println(c); 
    	}
        
        
        
    }
    

