package sistemasolar;

import javax.swing.JOptionPane;

public class Asteroide extends SistemaSolar
{   private double risco;
    private String classe;		//vai ser um ponteiro

    public Asteroide(double risco, String classe, String nome, String espectroDeLuz, String galaxia, double massa, double temperatura, double velocidade, double volume, double diametro, double acelGravidade, int idade) {
        super(nome, espectroDeLuz, galaxia, massa, temperatura, velocidade, volume, diametro, acelGravidade, idade);
        this.risco = risco;
        this.classe = classe;
    }
    
    //getters
    public double getRisco() {  return risco;   }
    public String getClasse() {   return classe;  }

    //setters
    public void setRisco(double risco) {    this.risco = risco; }
    public void setClasse(String classe) {    this.classe = classe;   }

    public void imprime()
    {   JOptionPane.showMessageDialog(null, 
            "\nNome: "+getNome()
            +"\nEspectro de Luz: "+getEspectroDeLuz()
            +"\nGaláxia: "+getGalaxia()
            +"\nMassa: "+getMassa()+" t."
            +"\nTemperatura Média: "+getTemperatura()+" ºC."
            +"\nVelocidade de órbita: "+getVelocidade()+ "km/h."
            +"\nVolume: "+getVolume()+" km³."
            +"\nDiâmetro: "+getDiametro()+" km."
            +"\nAceleração da Gravidade: "+getAcelGravidade()+" m/s²."
            +"\nIdade: "+getIdade()+" anos.\n"
            +"\nRisco de Atingir a Terra: "+getRisco()
            +"\nClasse: "+getClasse()+"\n\n"
        );
    }
}
