import java.util.Scanner; 
 
class Main { 
 public static void main(String[] args) { 
 Scanner dados = new Scanner(System.in); 
 
 String ast = "*"; 
 int n=0; 
 int limite; 
 
 System.out.print("Insira um número de 1 a 10: "); 
 limite = dados.nextInt(); 
 
 do{ 
 
 for(int c = 0; c < n; c++){ 
 System.out.print(ast + " "); 
 }System.out.print("\n"); 
 n++; 
 }while(n<=limite); 
 
 } 
} 