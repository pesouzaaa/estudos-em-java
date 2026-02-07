import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        var name = scanner.next();

        System.out.println("Informe a sua idade:");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? (s/n)");
        var emancipado = scanner.next().equalsIgnoreCase("s");

        if (age >= 18){
                 System.out.printf("%s tem %d anos, você pode dirigir\n", name, age);
        } else if ( age >= 16 && emancipado){
            System.out.printf("%s, apesar de você ter %s anos, você pode dirigir, pois é emancipado\n", name, age );

        } else{
            System.out.printf("%s, você não pode dirigir, pois tem %s \n", name, age );
         }
           
         System.out.println("Fim da execução");
    }
}