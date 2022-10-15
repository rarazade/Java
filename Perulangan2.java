/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangan2;

/**
 *
 * @author Rxzade
 */
public class Perulangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("==C==");
        int x = 1;
        while(x <=5){
        int y = 1;
        while(y<=5){
            System.out.print(y==5 ? "0" : "*");
            y++;
        }
        System.out.println();
        x++;
        }
        
        System.out.println("==D==");
        int a = 1;
        while(a <=5){
        int b = 1;
        while(b<=5){
            System.out.print(a==1 || b==1 ? "0" : "*");
            b++;
        }
        System.out.println();
        a++;
        }
        
        System.out.println("==E==");
        int c = 1;
        while(c <=5){
        int d = 1;
        while(d<=5){
            System.out.print(c==d ? "0" : "*");
            d++;
        }
        System.out.println();
        c++;
        }
        
        System.out.println("==F==");
        int i = 1;
        while(i <=5){
        int j = 1;
        while(j<=5){
            System.out.print(i==5 || j==5 ? "0" : "*");
            j++;
        }
        System.out.println();
        i++;
        }
        // TODO code application logic here
    }
    
}
