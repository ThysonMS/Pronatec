import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Q1();
    Q2();
    Q3();

  }

  static void Q1(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("\n### 1ª QUESTÃO ###\n");
    
    System.out.print("Digite o valor de n: ");
    int n = scan.nextInt();
    
    int soma = 0;
    
    for (int i = 1; i <= n; i++){
      soma = soma + i;
    }
    System.out.println("\nResultado: " + soma + "\n");
  }

  static void Q2(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("### 2ª QUESTÃO ###\n");
    
    System.out.print("Digite o valor de n: ");
    int n = scan.nextInt();
    
    System.out.println();
    
    int soma = 0;
    
    for (int i = 1; i <= n; i++){
      System.out.print(i + "; ");
      soma = soma + i;
    }
    System.out.println();
    
    System.out.println("\nResultado: " + soma + "\n");
  }

  static void Q3(){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("### 3ª QUESTÃO ###\n");
    
    System.out.print("Digite o valor de A: ");
    int a = scan.nextInt();
    System.out.print("Digite o valor de B: ");
    int b = scan.nextInt();
    
    int soma = 0;
    
    for (int i = a; i <= b; i++){
      if(i % 2 != 0){
        soma = soma + i;
      }
    }
    System.out.println("\nResultado: " + soma + "\n");
  }

}