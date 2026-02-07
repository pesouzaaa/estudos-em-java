import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var name = "exit";
        do {
            System.out.println("Informe o seu nome");
            name = scanner.next();
            System.out.println(name);
        }   while (!name.equalsIgnoreCase("exit"));
    }

}