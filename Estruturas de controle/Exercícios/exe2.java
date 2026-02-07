import java.util.Scanner;

public class exe2 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Escreva a sua altura em centimentros");
        double altura = scanner.nextDouble();
        double alturaMetros = altura / 100.0;
        System.out.println("Escreva o seu peso arredondado");
        double peso = scanner.nextDouble();
        double imc = peso/(alturaMetros * alturaMetros);

      
    
      if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } 
        else if (imc <=24.9){
            System.out.println("Peso Ideal");
        }
        else if ( imc <=29.9){
            System.out.println("Levemente acima do peso");     
        } 
        else if (imc <=34.9){
            System.out.println("Obesidade I");
        } 
        else if (imc <=39.9){
            System.out.println("Obesidade II");
        } 
        else {
            System.out.println("Obesidade III");
    }
  }
}
