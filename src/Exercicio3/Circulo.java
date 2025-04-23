package Exercicio3;

import java.util.Scanner;

public class Circulo {
    private double raio;
    private double area;
    private double perimetro;
    private final double PI = 3.14;
    public Circulo(){}

        public Circulo(double raio){
        this.raio = raio;
        }

        public void calculaArea(){
            area = raio * raio * PI;
            System.out.println(area);
        }

        public void calculaPerimetro(){
            perimetro = 2 * PI * raio;
            System.out.println(perimetro);
        }

    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.calculaArea();
        c.calculaPerimetro();
        Circulo c2 = new Circulo(4);
        c2.calculaArea();
        c2.calculaPerimetro();
        Circulo c3 = new Circulo(10);
        c3.calculaArea();
        c3.calculaPerimetro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Circulo c4 = new Circulo(sc.nextDouble());
        c4.calculaArea();
        c4.calculaPerimetro();
    }


}
