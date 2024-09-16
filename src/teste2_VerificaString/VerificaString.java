package teste2_VerificaString;
import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com uma string: ");
        String str = scanner.nextLine();

        int count = 0;
        for(int c=0; c<str.length(); c++){
            if(str.toUpperCase().charAt(c) == 'A') count++;
        }

        System.out.println("Numeros de ocorrências da letra 'a': " + count);
        scanner.close();
    }
}
