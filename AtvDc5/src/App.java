import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int idade = entrada.nextInt();
        
        if (idade <18) {
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
         }

            entrada.close();

        }












    }

