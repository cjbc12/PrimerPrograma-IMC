/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.cbarraganc.imc2;
import java.util.Scanner;

/**
 *
 * @author Barra
 */
public class SSPCBarraganCIMC2 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        double w, l, imc;
        String eIMC;
        
        //En la siguiente línea, le indico a Java que utilizaré en el 
        //teclado
        Scanner tec = new Scanner (System.in);
        System.out.println("Introduce el peso");
        w= tec.nextDouble();
        System.out.println("Introduce la estatura");
        l= tec.nextDouble();
        // Resolver el problema
        imc= w/Math.pow(l,2);
        
        if(imc>25){
            eIMC="Sobrepeso";
        }else if(imc<19){
            eIMC="Desnutrido";
        }else {
            eIMC="Normal";
        }
        System.out.println("Peso= "+w);
        System.out.println("Estatura= " +l);
        System.out.println("IMC= "+imc);
        System.out.println(eIMC);
    
    }
    
}
