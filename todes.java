import java.util.*;
public class todes{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
     int cont = 0;

     System.out.println("_________________Tabela de orientações__________________");
     System.out.println("||       1: Vá para a direita                         ||");
     System.out.println("||       2: Esquerda, agora                           ||");
     System.out.println("||       3: Passe para o Viaduto da frente            ||");
     System.out.println("||       4: Espere o sinal Tabela de orientações      ||");
     System.out.println("||       5: Continue indo reto                        ||");
     System.out.println("________________________________________________________");
    
    System.out.print("Quantas orientações deseja passar? ");
   int orienta = ler.nextInt();

for (cont = 1;cont <= orienta; cont ++){

    System.out.print("Qual a "+ cont +"° orientação? ");
   int resp = ler.nextInt();

   if (resp == 1){
    System.out.println("Pra já!");
   }else if (resp == 2){
    System.out.println("Esquerdei, e agora?");
   }else if (resp == 3){
    System.out.println("Eita pipoco. Zumm!");
   }else if (resp == 4){
    System.out.println("Ok!");
   }else if (resp == 5){
    System.out.println("Pronto e agora, e agora?");
   }else {
    System.out.println("Digite uma orientação válida!");
   }
    
}
   System.out.println("Todas as orientações foram correspondidas :)");
   
    }

}