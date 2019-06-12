package main;

import interfaces.FormaAsteroide;
import interfaces.FormaSistemaSolar;
import sistemasolar.Asteroide;
import sistemasolar.EstacaoEspacial;
import sistemasolar.Estrela;
import sistemasolar.Planeta;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Planeta p1 = new Planeta(24, 1.4E+8, 0.01, "Terra", "Azul", "ViaLactea", 5.9E+24, 20, 107200, 1.08E+123, 9.8, 12756.2, 4);	//construtor
        p1.imprime();   
        
        EstacaoEspacial ee1 = new EstacaoEspacial("ISS", 1998, 370, 27556, 27600);	//construtor
        ee1.imprime();
        
        Asteroide ast1 = new Asteroide(0, "c", "433Eros", "Cinza", "ViaLactea", 7.2E+15, -46, 24.26, 3.3E+17, 0.0059, 33, 1/*risco*/);
        ast1.imprime();
        
        Estrela est1 = new Estrela(233, 25, 5, 10E-5, 71, true, "Sol", "Amarelo", "ViaLactea", 1.9E+30, 5778, 2.2E+5, 1.4E+18, 1.3E+9, 270, 4);
        est1.imprime();
    
           
       
        new FormaSistemaSolar().setVisible(true);  
      

    
    }
    
    
}
