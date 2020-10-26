package triangulo;
import java.util.Scanner;
public class Triangulo
{
    public static void main(String[] args)
    {
     Scanner entrada = new Scanner (System.in);
     
     int a,b,c;
     
     System.out.print("Digite o valor do lado A: ");
     a = entrada.nextInt();
     
     System.out.print("Digite o valor do lado B: ");
     b = entrada.nextInt();
     
     System.out.print("Digite o valor do lado C: ");
     c = entrada.nextInt();
     
     if (a+b>c && a+c>b && b+c>a);     
     if (a==b && a==c && b==c)
     {
         System.out.println("Os valores formaram um triângulo equilátero");
     }
     
     else if (a!=b && a!=c && b!=c)
     {
         System.out.println("Os valores formaram um triângulo escaleno");
     }
     
     else if (a==b && a!=c || a==c && a!=b || b==c && b!=a) 
     {
         System.out.println("Os valores formaram um triângulo isóceles");
     }
     else if (a==0 && b==0 && c==0)
     {
         System.out.println("Os valores não formaram um triângulo");
     }
    }
    
}
