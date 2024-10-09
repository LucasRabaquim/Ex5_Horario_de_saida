package lucas_rafa_05;
import java.util.Scanner;
public class Lucas_Rafa_05 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite seu horário de entrada: ");
       double hora = entrada.nextDouble() + 6;
       hora = hora % 24;
       System.out.print("O horário de saida é: " + hora +"h" );
    }   
}
