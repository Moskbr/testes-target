package teste1_Fibonacci;
import java.util.Scanner;

public class Fibonacci {
    
    static boolean fibonacci(int n)
    {                               //           a  b  c
        int a = 0, c = 0, b = 1;    // inicia em 0, 1,
        while(n > a){
            c = a + b;              // prox na sequencia de fibonacci
            a = b;                  // 'anda' com termo a para frente
            b = c;                  // 'anda' com termo b para frente
        }

        return a == n;              // 'true' se pertence a sequencia
    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int n = scanner.nextInt();
        
        if(fibonacci(n))
            System.out.println("Pertence a sequência de Fibonacci");
        else
            System.out.println("Não pertence a sequência de Fibonacci");
        
            scanner.close();
    }
}
