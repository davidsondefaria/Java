package sistemasolar;

import static java.lang.Math.PI;
import javax.swing.JOptionPane;

public class Planeta extends SistemaSolar
{

    private double tpRotacao;
    private double distanciaSol;
    private double excentricidade;

    public Planeta(double tpRotacao, double distanciaSol, double excentricidade, String nome, String espectroDeLuz, String galaxia, double massa, double temperatura, double velocidade, double volume, double diametro, double acelGravidade, int idade) {
        super(nome, espectroDeLuz, galaxia, massa, temperatura, velocidade, volume, diametro, acelGravidade, idade);
        this.tpRotacao = tpRotacao;
        this.distanciaSol = distanciaSol;
        this.excentricidade = excentricidade;
    }
        
    //getters
    public double getTpRotacao() {  return tpRotacao;    }
    public double getDistanciaSol() {   return distanciaSol;    }
    public double getExcentricidade() { return excentricidade;  }
    
    //setters
    public void setTpRotacao(double tpRotacao) {    this.tpRotacao = tpRotacao; }
    public void setDistanciaSol(double distanciaSol) {  this.distanciaSol = distanciaSol;   }
    public void setExcentricidade(double excentricidade) {  this.excentricidade = excentricidade;   }
    
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
            +"\nTempo de Rotação: "+getTpRotacao()+" h."
            +"\nDistância ao Sol: "+getDistanciaSol()+" km"
            +"\nExcentricidade: "+getExcentricidade()
            //+"\nVelocidade de Rotação: "+calcVelRot()+" km/h.";
        );
    }

    double calcVelRot()
    {	double circ;
        circ = (PI*getDiametro());
        double tpr;
        tpr = getTpRotacao();
        return (circ/tpr);
    }
}