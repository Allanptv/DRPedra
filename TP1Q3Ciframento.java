import java.util.Scanner;
//O programa le enquando a entrada for diferente de  FIM .
public class TP1Q3Ciframento {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String[] entrada = new String[1000];
		int linha=0;
		
		entrada[linha] = s.nextLine();
		while(!ehIgual(entrada[linha], "FIM")){
			linha++;
			entrada[linha] = s.nextLine();
		}//fim while

		for(int i=0;i<linha;i++){
		 	System.out.println(criptografada(entrada[i]));
		}//fim for
	}//fim main()

	public static boolean ehIgual(String s1, String s2){
		boolean igual = true;
		if(s1.length()!=s2.length()) igual = false;
		else{
			int i=0;
			while(i<s1.length() && s1.charAt(i)==s2.charAt(i)){
				i++;
			}//fim for
			if(i<s1.length()) igual = false;
		}//fim if/else
		return igual;
	}//fim ehIgual()

	public static String criptografada(String s){
	
		String msg="";
		for(int i=0;i<s.length();i++){
			msg = msg + (char)(3+(int)s.charAt(i));
		}//fim for
		return msg;
	}//fim criptografada()

}//fim class
