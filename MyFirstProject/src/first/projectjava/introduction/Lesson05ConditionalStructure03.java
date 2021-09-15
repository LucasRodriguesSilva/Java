package first.projectjava.introduction;

public class Lesson05ConditionalStructure03 {
    public static void main(String[] args) {
        //Se salario >= 5000 ótimo.
        double salario = 6000;
        String frasePositiva = ("Você está indo bem!");
        String fraseConselho = ("Estude mais!");
        String resultado = salario >= 5000 ? frasePositiva : fraseConselho;
        System.out.println(resultado);
    }
}
