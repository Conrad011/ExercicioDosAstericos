import java.util.Scanner; 

class Main { 
 public static void main(String[] args) { 
 Scanner dados = new Scanner(System.in); 

 String ast = "*"; 
 int i=0; 
 int j=0;
  int n1;

   do{
    System.out.println("Digite o tamanho entre 1 e 10: ");       n1 = dados.nextInt();

     if(n1>10 || n1<1){
       System.out.println("ERRO! Número inválido!");
     }
   }while(n1>10 || n1<1);


 for(i=0; i<n1; i++){ 
   for(j=0; j<(n1-i); j++){
  System.out.print(ast + " ");
   }
   System.out.println();
   

    }

 }

 }