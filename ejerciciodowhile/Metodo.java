
package ejerciciodowhile;
import java.util.Scanner;
public class Metodo {
    private int num;
    private int suma;
    private int cont = 0;
    Scanner sc = new Scanner(System.in);
      
    
    public int pedirDatos(){
     System.out.print("Teclea numero: ");
     num= sc.nextInt();
     return num;
    }
    public void sumaPar(){
    do{
      num=pedirDatos();
      if(num%2==0)
          suma = suma + num;
    cont++;
    }while(cont < 5);
        System.out.println(suma);
    }
}