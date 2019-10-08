import java.util.Scanner;
public class Anobissextoounao{
   /***************************************************************
* Nome do método: main.
* Data da elaboração: 22/03/2018
* Data da última alteração: 22/03/2018
* Autor: Breno Soares Valadares Veloso.
* Contexto de ação: Escreve se o ano é bissexto ou nao
* Argumentos: String[]args.
* Valor gerado:
****************************************************************
*/
public static void main(String[]args){
      Scanner teclado = new Scanner(System.in);
      int ano;
      System.out.println("Ola usuario este programa vai falar se o ano lido eh bissexto ou nao.");
      System.out.print("Digite o ano desejado: ");
         ano = teclado.nextInt();
      if(ehbissexto(ano)){
      System.out.print("O ano " + ano + " eh bissexto.");
      }//fim if ehbissexto
      else{
         System.out.print("O ano " + ano + " nao eh bissexto.");
      }//fim else
   }//fim main
   /***************************************************************
* Nome do método: exbissexto.
* Data da elaboração: 22/03/2018
* Data da última alteração: 22/03/2018
* Autor: Breno Soares Valadares Veloso.
* Contexto de ação: Calcula e vê se o ano é bissexto ou nao.
* Argumentos: Ano
* Valor gerado: ehbissexto
****************************************************************
*/
   public static boolean ehbissexto(int Ano){
      boolean ehbissexto;
      if(Ano%4!=0){
         ehbissexto = false;
      }//fim if mod 4
      else{
         if(Ano%100!=0){
            ehbissexto = true;
         }//fim mod 100
         else{
            if(Ano%400!=0){
               ehbissexto = false;
            }//fim mod 400
            else{
               ehbissexto = true;
            }//fim else 3
         }//fim else 2
      }//fim else 1
   return ehbissexto;     
   }//fim ehbissexto
}//fim class