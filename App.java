import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, totaol;

         System.out.println("informe a nota do primeiro semestre");

           nota1 = input.nextDouble();

        System.out.println("informe a nota do segundo semestre");

           nota2 = input.nextDouble();

         System.out.println("informe a nota do terceiro semestre");
        
            nota3 = input.nextDouble();

        totaol = (nota1 + nota2 + nota3) / 3;
        
         System.out.println("A media e  " + totaol);

    }
}
