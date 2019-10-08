import java.util.Scanner;
public class Pesoideal{
   /***************************************************************
* Nome do método: main.
* Data da elaboração: 25/03/2018
* Data da última alteração: 25/03/2018
* Autor: Breno Soares Valadares Veloso.
* Contexto de ação: Lê qual o genero do usuario, recebe o peso ideal e escreve na tela.
* Argumentos: String[]args.
* Valor gerado:
****************************************************************
*/   
   public static void main(String[]args){
      Scanner teclado = new Scanner(System.in);
      char genero;
      boolean ERRO;
      System.out.print("Ola usuario, este programa ira calcular o peso ideal de uma pessoa, de acordo com sua altura e seu genero.");
      do{
      System.out.print("\nDigite o seu genero: [M] para masculino e [F] para feminino: ");
         genero = teclado.next().charAt(0);
         genero = Character.toUpperCase(genero);
         ERRO = genero != 'M' && genero != 'F';
         if(ERRO) System.out.print("Digite uma letra entre [M] e [F].");
      }while(ERRO);
      if(genero == 'M'){
         System.out.print("Seu peso ideal eh: " + generomasculino());
      }//fim genero masculino   
      if(genero == 'F'){
         System.out.print("Seu peso ideal eh: " + generofeminino());
      }//fim genero feminino   
   }//fim main
   /***************************************************************
* Nome do método: generomasculino
* Data da elaboração: 25/03/2018
* Data da última alteração: 25/03/2018
* Autor: Breno Soares Valadares Veloso.
* Contexto de ação: Calcula o peso ideal de um homem.
* Argumentos:
* Valor gerado:pesoideal
****************************************************************
*/
   public static double generomasculino(){
      double altura, pesoideal;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Digite sua altura: ");
         altura = teclado.nextDouble();
      pesoideal = (72.7*altura) - 58;
      return pesoideal;
   }//fim metodo generomasculino
   /***************************************************************
* Nome do método: generofemino
* Data da elaboração: 25/03/2018
* Data da última alteração: 25/03/2018
* Autor: Breno Soares Valadares Veloso.
* Contexto de ação: Calcula o peso ideal de uma mulher
* Argumentos:
* Valor gerado: pesoideal
****************************************************************
*/
   public static double generofeminino(){
      double altura, pesoideal;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Digite a sua altura: ");
      altura = teclado.nextDouble();
      pesoideal = (62.1*altura) - 44.7;
      return pesoideal;
   }//fim metodo generofeminino
}//fim class