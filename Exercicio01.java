import java.util.Scanner; 
 
class Main { 
 public static void main(String[] args) { 
 Scanner dados = new Scanner(System.in); 
 
 String ast = "*"; 
 int n; 
 int i = 0; 
 
 do{ 
 System.out.println("\nInsira um numero entre 1 e 10: "); 
 n = dados.nextInt(); 
 if(n>10 || n<1){ 
 System.out.print("ERRO! Número inválido"); 
 } 
 }while(n>10 || n<1); 
 
 do{ 
 
 for(int c = 0; c < n; c++){ 
 System.out.print(ast + " "); 
 }System.out.print("\n"); 
 i++; 
 }while(i<n); 
 
 
 
 } 
}