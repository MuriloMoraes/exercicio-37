import java.util.Scanner;

public class exercicio37
{   
    public static void main(String[] args){
   System.out.print("Digite um numero: ");
   int x = new Scanner(System.in).nextInt();
   int aux = x;
   int fat = x * (x-1);
   x = x-2;
   while (x>0){
    
        fat = fat * x;
        --x;

    }
     System.out.println( " O fatorial de " + aux + " é " + fat);
}
}
