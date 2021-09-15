package first.projectjava.introduction;

public class Lesson05ConditionalStructure02 {
    public static void main(String[] args) {
        int idade = 17;
        String categoria;
        if (idade < 15) {
            categoria = "Classe infantil";
        }else if(idade >=15 && idade < 18){
            categoria = "Classe adolescente";
        }else{
            categoria = "Classe adulto";
        }
        System.out.println(categoria);
    }
}