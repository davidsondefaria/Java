package sistemasolar;

import javax.swing.JOptionPane;

public class Estrela extends SistemaSolar
{
    private double tpTranslacao;
    private double tpRotacao;
    private int kp;
    private double fluxo;
    private int manchas;
    private boolean emc;

    public Estrela(double tpTranslacao, double tpRotacao, int kp, double fluxo, int manchas, boolean emc, String nome, String espectroDeLuz, String galaxia, double massa, double temperatura, double velocidade, double volume, double diametro, double acelGravidade, int idade) {
        super(nome, espectroDeLuz, galaxia, massa, temperatura, velocidade, volume, diametro, acelGravidade, idade);
        this.tpTranslacao = tpTranslacao;
        this.tpRotacao = tpRotacao;
        this.kp = kp;
        this.fluxo = fluxo;
        this.manchas = manchas;
        this.emc = emc;
    }
    

    //getters
    public double getTpTranslacao() {   return tpTranslacao;    }
    public double getTpRotacao() {  return tpRotacao;   }
    public int getKp() {    return kp;  }
    public double getFluxo() {  return fluxo;   }
    public int getManchas() {   return manchas; }
    public boolean isEmc() {    return emc; }

    //setters
    public void setTpTranslacao(double tpTranslacao) {  this.tpTranslacao = tpTranslacao;   }
    public void setTpRotacao(double tpRotacao) {    this.tpRotacao = tpRotacao; }
    public void setKp(int kp) { this.kp = kp;   }
    public void setFluxo(double fluxo) {    this.fluxo = fluxo; }
    public void setManchas(int manchas) {   this.manchas = manchas; }
    public void setEmc(boolean emc) {   this.emc = emc; }
    
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
            +"\nTempo de Translação: "+getTpTranslacao()+" milhões de anos em relação ao centro da galáxia."
            +"\nTempo de Rotação: "+getTpRotacao()+" dias na linha do equador."
            +"\nEjeção de Massa Coronal: "+isEmc()
            +"\nIntensidade de EMC: "+getKp()
            +"\nFluxo de Raios X: "+getFluxo()
            +"\nManchas: "+getManchas()+"\n\n"
        );
    }

    void inversao(int ultima)
    {
        //int x = 11 - (2014-ultima);
        //if (x > 0)
            //cout<<"\nFaltam, aproximadamente, "<<x<<" anos para próxima inversão.";
        //else if (x<0)
            //cout<<"\nA última inversão ocorreu há, aproximadamente, "<<x<<" anos.";
        //else
            //cout<<"\nA inversão poderá ocorrer nesse ano.";
    }
}