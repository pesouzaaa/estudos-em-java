import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    
 System.out.println("Escolha um número");
    var numOne = scanner.nextInt();
int numTwo;

do {
    System.out.println("Escolha o segundo número, sendo ele maior que o primeiro");
        numTwo = scanner.nextInt();
    if (numTwo <= numOne){
        System.out.println("O segundo número presica ser MAIOR que o primeiro");
    }

} while (numTwo <= numOne);
System.out.println("Quer mostrar números pares ou impares? (par/impar)");
    var parimpar = scanner.next().toLowerCase();

for (int i = numTwo; i >= numOne; i--){
    if (parimpar.equalsIgnoreCase("par") && i % 2 == 0) {
        System.out.println(i);
    } else if (parimpar.equalsIgnoreCase("impar") && i % 2 != 0){
        System.out.println(i);
    }

        }
    }
}