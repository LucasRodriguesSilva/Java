package first.projectjava.introduction;

public class Lesson05ConditionalStructure {
    public static void main(String[] args) {
        int idade = 18;
        boolean isMaiorDeIdade = idade >= 18;
        if (isMaiorDeIdade){
            System.out.println("Voçê é maior de idade!");
        }

        if (!isMaiorDeIdade){
            System.out.println("Você é menor de idade!");
        }
    }
}
