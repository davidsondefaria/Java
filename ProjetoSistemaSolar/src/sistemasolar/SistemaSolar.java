package sistemasolar;

import javax.swing.JOptionPane;

public abstract class SistemaSolar {

    protected String nome;
    protected String espectroDeLuz;
    protected String galaxia;
    protected double massa;
    protected double temperatura;
    protected double velocidade;	//de órbita
    protected double volume;
    protected double diametro;
    protected double acelGravidade;
    protected int idade;

    public SistemaSolar(String nome, String espectroDeLuz, String galaxia, double massa, double temperatura, double velocidade, double volume, double diametro, double acelGravidade, int idade) {
        this.nome = nome;
        this.espectroDeLuz = espectroDeLuz;
        this.galaxia = galaxia;
        this.massa = massa;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.volume = volume;
        this.diametro = diametro;
        this.acelGravidade = acelGravidade;
        this.idade = idade;
    }

    //sobrecarga
    public SistemaSolar(String nome, String galaxia, int idade) {
        this.nome = nome;
        this.galaxia = galaxia;
        this.idade = idade;
    }
    
    //getters
    public String getNome() {   return nome;    }
    public String getEspectroDeLuz() {  return espectroDeLuz;    }
    public String getGalaxia() {    return galaxia;    }
    public double getMassa() {  return massa;    }
    public double getTemperatura() {    return temperatura;    }
    public double getVelocidade() { return velocidade;    }
    public double getVolume() { return volume;    }
    public double getDiametro() {   return diametro;    }
    public double getAcelGravidade() {  return acelGravidade;    }
    public int getIdade() { return idade;   }

    //setters
    public void setNome(String nome) {  this.nome = nome;    }
    public void setEspectroDeLuz(String espectroDeLuz) {    this.espectroDeLuz = espectroDeLuz;    }
    public void setGalaxia(String galaxia) {    this.galaxia = galaxia;    }
    public void setMassa(double massa) {    this.massa = massa;    }
    public void setTemperatura(double temperatura) {    this.temperatura = temperatura;    }
    public void setVelocidade(double velocidade) {  this.velocidade = velocidade;    }
    public void setVolume(double volume) {  this.volume = volume;    }
    public void setDiametro(double diametro) {  this.diametro = diametro;    }
    public void setAcelGravidade(double acelGravidade) {    this.acelGravidade = acelGravidade;    }
    public void setIdade(int idade) {   this.idade = idade;    }

    double calcDensidade()
    {   return 0;   }
    
    //métodos membros
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
            +"\nIdade: "+getIdade()+" anos. \n\n"
        );
    }
    public void impSisSolar()
    {   JOptionPane.showMessageDialog(null, 
            "\nNome: "+getNome()
            +"\nGaláxia: "+getGalaxia()
            +"\nIdade: "+getIdade()+" anos. \n\n"
        );
    }

}
