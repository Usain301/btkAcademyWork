/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject1primenumber.asallsayı;
import java.util.Scanner;

/**
 *
 * @author JET BİLİŞİM
 */
public class MiniProject1PrimeNumberAsallSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry=new Scanner(System.in);
        int number=entry.nextInt();
        int remainder=number%2;
        System.out.println(remainder);
        
        boolean isPrime=true;
        
        for (int i = 2; i < number; i++) {
            
            if (number % i == 0) {
                isPrime= false;
            }
            
        }
        if(isPrime){
            System.out.println("Sayı Asaldır");
        }else{
            System.out.println("Sayı asal değildir");
                }
    }
    
}
