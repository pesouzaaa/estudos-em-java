import java.util.Scanner;

public class main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");
        var option = scanner.nextInt();
        
       var mensage = switch (option){
            case 1 -> "Domingo";   
            case 2 -> "Segunda"; 
            case 3 -> "Terça"; 
            case 4 -> "Quarta"; 
            case 5 -> "Quinta"; 
            case 6 -> "Sexta";          
            case 7 -> "Sábado"; 
            default -> "Opção Inválida";
        };
        System.out.println(mensage);
    }
}