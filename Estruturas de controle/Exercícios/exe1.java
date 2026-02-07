import java.util.Scanner;

public class exe1{

public static void main(String[] args){
    var scanner = new Scanner (System.in);
    System.out.println("Insira um número para realizar a tabauada");
    var number = scanner.nextInt();
    
    for (int i = 1; i <= 10; i++){
        System.out.println(number + "x"+ i + "=" + (number*i));
    }

  }
}
