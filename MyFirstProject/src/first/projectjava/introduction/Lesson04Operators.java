package first.projectjava.introduction;

public class Lesson04Operators {
    public static void main(String[] args){
        int numero01 = 10;
        int numero02 = 20;
        double total = numero01 / (double) numero02;
        System.out.println(total);

        int resto = 10 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        int idade = 29;
        int idadeLei = 30;
        float salario = 3500F;
        float salarioLeiUm = 4612;
        float salarioLeiDois = 3381;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= idadeLei && salario >= salarioLeiUm;
        boolean isDentroDaLeiMenorQueTrinta = idade < idadeLei && salario >= salarioLeiDois;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlastation = 5000F;
        boolean isplaystationCincoCompravel = valorTotalContaCorrente > valorPlastation || valorTotalContaPoupanca > valorPlastation;
        System.out.println("isPlastationCincoCompravel "+isplaystationCincoCompravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);

    }
}
