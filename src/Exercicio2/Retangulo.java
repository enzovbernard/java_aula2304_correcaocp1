package Exercicio2;

public class Retangulo {
    double altura = 1;
    double largura = 1;
    static String cor = "branco";
    Retangulo(){
        //construtor padrao - nao faz nada
    }
    Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public String getCor(){
        return cor;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
public double calculaArea(){
        return largura*largura;
}

    public double calculaPerimetro(){
        return (2*largura) + (2*altura);
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        System.out.println("Primeiro Retangulo");
        System.out.println("Largura:" + r.getLargura());
        System.out.println("Altura:" + r.getAltura());
        System.out.println("Cor:" + r.getCor());
        System.out.println("Area:" + r.calculaArea());
        System.out.println("Perimetro:" + r.calculaPerimetro());

        Retangulo r2 = new Retangulo(5,10);
        System.out.println("\nSegundo Retangulo");
        System.out.println("Largura:" + r2.getLargura());
        System.out.println("Altura:" + r2.getAltura());
        System.out.println("Cor:" + r2.getCor());
        System.out.println("Area:" + r2.calculaArea());
        System.out.println("Perimetro:" + r2.calculaPerimetro());
    }
}
