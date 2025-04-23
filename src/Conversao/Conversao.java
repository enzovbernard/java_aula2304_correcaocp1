package Conversao;

public class Conversao {

    static double f = 0;
    static double k = 0;
    static double ra = 0;
    static double re = 0;

    public static void calculaF(double celsius){
        f = celsius * 1.8 + 32;
        System.out.println("Temp F:" + f);
    }

    public static void calculaRA(double celsius){
        ra = celsius * 1.8 + 32 + 459.67;
        System.out.println("Temp RA:" + ra);
    }

    public static void calculaK(double celsius) {
        k = celsius + 273.15;
        System.out.println("Temp K:" + k);
    }

    public static void calculaRE(double celsius){
        re = celsius * 0.8;
        System.out.println("Temp RE:" + re);
    }

    public static void imprime(double celsius){
        calculaK(celsius);
        calculaF(celsius);
        calculaRE(celsius);
        calculaRA(celsius);
    }
}
