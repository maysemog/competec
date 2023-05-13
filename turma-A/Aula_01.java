import java.util.Scanner;

import org.w3c.dom.css.CSS2Properties;
public class Aula_01 {
public static void main(String[] args) {
    /*String mensagem = "Olá tudo bem?";
    System.out.println(mensagem);*/

    Scanner ler = new Scanner(System.in);
   

    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    /*double maca = 2.0;
    double pera = 3.0;
    double abacaxi = 7.30;

    System.out.print("Quantas maçãs foram compradas? ");
    maca *= ler.nextInt();

    System.out.print("Quantos abacaxis foram comprados? ");
    abacaxi *= ler.nextInt();

    System.out.print("Quantas pêras foram compradas? ");
    pera *= ler.nextInt();
    
    double resultado = abacaxi + maca + pera;

    System.out.printf("O preço final é: R$%,.2f\n",resultado);*/

    /*int maior = 18;
    int idade = 0;

    System.out.print("Digite sua idade: ");
    idade = ler.nextInt();


    if (idade < maior){
        System.out.println("Você possui menoridade");
    }else {
        System.out.println("Você possui maioridade");
    }*/
   
    /*System.out.print("Digite o primeiro valor: ");
   double valor1 = ler.nextDouble();

   System.out.print("Digite o segundo valor: ");
   double valor2 = ler.nextDouble();


   if (valor1 == valor2){
    System.out.println("Os valores são iguais.");
   }else {
    System.out.println("Os valores são diferentes.");
   }*/
   
  /* System.out.print("Digite a primeira idade: ");
   int idade1 = ler.nextInt();

   System.out.print("Digite a segunda idade: ");
   int idade2 = ler.nextInt();


   if (idade1 < idade2){
       System.out.println("A segunda pessoa é mais velha.");
   }else if (idade1 > idade2 ){
       System.out.println("A primeira pessoa é mais velha.");
   }else {
    System.out.println("As duas pessoas possuem a mesma idade ");
   }*/
  
/*boolean chuva;
boolean nublado;
boolean sol;

System.out.print("Está chovendo? [true/false] ");
chuva = ler.nextBoolean();

System.out.print("Está nublado? [true/false] ");
nublado = ler.nextBoolean();

System.out.print("Está ensolarado? [true/false] ");
sol = ler.nextBoolean();

if(chuva == true || nublado == true){
    System.out.println("Está chovendo ou nublado");
}else {
    System.out.println("Está ensolarado.");
}
 */
/*String tempo;

System.out.print("Como está o clima? ");
tempo = ler.nextLine();


if(tempo.equals("chuva") == 0 ){
    System.out.println("Está chovendo");
}else {
    System.out.println("Está ensolarado.");
}*/


/*boolean chuva;
boolean guardaChuva;


System.out.print("Está chovendo? [true/false] ");
chuva = ler.nextBoolean();

System.out.print("Está com o guarda-chuva ? [true/false] ");
guardaChuva = ler.nextBoolean();

if(chuva == true && guardaChuva == true){
    System.out.println("Está chovendo e eu estou de boa");
}else {
    System.out.println("Está chovendo e eu estou lascado");
}*/
 
boolean  cond;
 System.out.print("Digite o número: ");
 int num = ler.nextInt();

 if (num % 3 == 0 || num % 5 ==0 ) {
    cond = true;
    System.out.println(cond);
 }else {
    cond = false;
    System.out.println(cond);
 }
 

 /*String opcao;
 

 System.out.print ("Qual operação você deseja fazer?");
 System.out.print ("||| A - DEPOSITO \n B - SAQUE \n C - EMPRESTIMO |||");
 opcao = ler.nextLine();

 switch(opcao){
    case "a":
        System.out.println("Você escolheu a opção Deposito, siga...");
        break;
    case "b":
        System.out.println("Você escolhe a opção Saque, siga...");
        break;
    case "c":
        System.out.println("Você escolheu a opção Emprestimo, siga...");
        break;
    default:
        System.out.println("Digite uma opção valida!");
 }*/


















}

}