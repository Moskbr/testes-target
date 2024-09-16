package teste3_varSOMA;

public interface Soma {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;
        while(k < indice){
            k++;
            soma += k;
        }
        System.out.println(soma);
    }
}
