package programa;

import java.util.Scanner;


public class JobRotation {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int menu = 9;
        
        while(menu != 0){
            System.out.println("\n\n\t___MENU___");
            System.out.println("\n1 - Atividade 1 \n2 - Atividade 2 \n3 - Atividade 3 \n4 - Atividade 4 \n5 - Atividade 5 \n0 - SAIR");
                System.out.print("\nEscolha a opção número: ");
                menu = sc.nextInt();

            if(menu == 1){
                atividade1();
            }
            if(menu == 2){
                atividade2();
            }
            if(menu == 3){
                atividade3();
            }
            if(menu == 4){
                atividade4();
            }
            if(menu == 5){
                atividade5();
            }
            
        }//FIM DO MENU PRINCIPAL
        
        sc.close();
    }
    
    
    public static void atividade1(){
        int soma = 0, k=0;
        
        for(int i=0; i<13; i++){
            k=k+1;
            soma=soma+k;
        }        
        System.out.println(soma);
    }
    
    
    
    public static void atividade2(){
        Scanner sc = new Scanner(System.in);
        
        int a = 0, b = 1, c;
        boolean fibonaci = false;
        
        System.out.print("Escolha um numero: ");
        int numero = sc.nextInt();
        
        //CALCULO FIBONACI
        while(b <= numero){           
            if(b == numero){
                fibonaci = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }//FIM DO WHILE
        
            if(b == numero){
                System.out.println("O numero " + numero + " faz parte da sequência Fibonaci!!!");                
            }
            else{
                System.out.println("O numero " + numero + " não faz parte da sequência Fibonaci!!!");
            }     
    }//FIM DA ATIVIDADE 2
   
    
    
    public static void atividade3(){
        double[] faturamentoDiario =  {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
	11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667,
	18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
        

        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, media=0;
        int diaMenor=0, diaMaior=0, diaMedia=0, dia=0;
        
        //CALCULAR A MEDIA E A QUANTIDADE DE DIAS COM RENDIMENTOS
        System.out.println("\n\tFaturamento Diario:");
        for(int i=0; i<faturamentoDiario.length; i++){           
            if(faturamentoDiario[i] != 0){
                media += faturamentoDiario[i];
                dia++;
            }
            //MENOR FATURAMENTO DO MES
            if(faturamentoDiario[i] != 0 && faturamentoDiario[i] < menor){               
                menor = faturamentoDiario[i];
                diaMenor = (i+1);
            }
            //MAIOR FATURAMENTO DO MES
            if(faturamentoDiario[i] > maior){                
                maior = faturamentoDiario[i];
                diaMaior = (i+1);
            }
            //MOSTRAR O FATURAMENTO DIARIO
            System.out.printf("Dia %d: %.2f\n", (i+1), faturamentoDiario[i]);
        }
        
        System.out.println();
        System.out.printf("O menor faturamento ocorreu no dia %d: R$ %.2f\n", diaMenor, menor);
        System.out.printf("O maior faturamento ocorreu no dia %d: R$ %.2f\n", diaMaior, maior);
        
        //SOMAR QUANTOS DIAS NO MES, O FATURAMENTO FOI MAIOR QUE A MEDIA
        media = media / dia;
        for(int i=0; i<faturamentoDiario.length; i++){             
            if(faturamentoDiario[i] > media){
                diaMedia++;
            }
        }   
        System.out.println("Em " + diaMedia + " dias o faturamento foi maior que a media.");
     
    }//FIM DA ATIVIDADE 3
    
    
    
    
    public static void atividade4(){
        double sp=67836.43, rj=36678.66, mg=29229.88, es=27165.48, outros=19849.53, valorTotal=0;
        
        valorTotal = sp + rj + mg + es + outros;
        System.out.println("\nPorcentagem de Faturamento por Estado:\n");
        System.out.printf("São Paulo = %.2f%%\n", (sp / valorTotal) * 100);
        System.out.printf("Rio de Janeiro = %.2f%%\n", (rj / valorTotal) * 100);
        System.out.printf("Minas Gerais = %.2f%%\n", (mg / valorTotal) * 100);
        System.out.printf("Espirito Santo = %.2f%%\n", (es / valorTotal) * 100);
        System.out.printf("Outros = %.2f%%\n", (outros / valorTotal) * 100);
        
    }//FIM DA ATIVIDADE 4
    
    
    
    public static void atividade5(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\nDigite seu texto: ");
        sc.nextLine();
        String texto = sc.nextLine();        
            String contrario="";
         
        //INVERTER OS CARACTERES DA STRING
        for(int i=texto.length() -1; i>0; i--){
            contrario += texto.charAt(i);
        }
        System.out.println("\n");
        System.out.println(contrario);
        
    }//FIM DA ATIVIDADE 5
    
 
}
