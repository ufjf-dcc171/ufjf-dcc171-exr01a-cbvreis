
package dcc171.exr01a;


public class Operações {

    private float largura;
    private  float altura, comprimento,volume;

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
   

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
   
    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
   
    public float getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = getAltura()*getLargura()*getComprimento();
    }
      
}
