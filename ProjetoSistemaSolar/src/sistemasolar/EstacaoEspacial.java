package sistemasolar;

import javax.swing.JOptionPane;

public class EstacaoEspacial {

    private String nome;
    private double altura;
    private double velOrbita;
    private double velMax;
    private int anoLancamento;

    public EstacaoEspacial(String nome, double altura, double velOrbita, double velMax, int anoLancamento) {
        this.nome = nome;
        this.altura = altura;
        this.velOrbita = velOrbita;
        this.velMax = velMax;
        this.anoLancamento = anoLancamento;
    }

    //getters
    public String getNome() {   return nome;    }
    public double getAltura() { return altura;  }
    public double getVelOrbita() {  return velOrbita;   }
    public double getVelMax() { return velMax;  }
    public int getAnoLancamento() { return anoLancamento;   }

    //setters
    public void setNome(String nome) {  this.nome = nome;   }
    public void setAltura(double altura) {  this.altura = altura;   }
    public void setVelOrbita(double velOrbita) {    this.velOrbita = velOrbita; }
    public void setVelMax(double velMax) {  this.velMax = velMax;   }
    public void setAnoLancamento(int anoLancamento) {   this.anoLancamento = anoLancamento;}

    public void imprime()
    {   JOptionPane.showMessageDialog(null, 
            "\nNome da Estação: "+getNome()
            +"\nAno de Lançamento: "+getAnoLancamento()
            +"\nAltura de Órbita: "+getAltura()+"km. "
            +"\nVelocidade de Órbita: "+getVelOrbita()+"km/h. "
            +"\nVelocidade Máxima: "+getVelMax()+"km/h. \n\n"
        );
    }
}
