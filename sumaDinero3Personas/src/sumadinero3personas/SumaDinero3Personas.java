
package sumadinero3personas;

import java.util.Scanner;

public class SumaDinero3Personas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float guillermo, luis, juan;
        
        System.out.print("Ingresa el dinero de Guillermo: ");
        guillermo = entrada.nextFloat();
        luis = guillermo/2;
        juan = (guillermo + luis)/2;
        
        System.out.println("Entre los tres tienen un total de:" + "$" + (guillermo + luis + juan));
    }
    
}
