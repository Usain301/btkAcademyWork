/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recapdemo1.en.büyük.sayı.find.the.largest.number;
import java.util.Scanner;

/**
 *
 * @author JET BİLİŞİM
 */
public class RecapDemo1EnBüyükSayıFindTheLargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry=new Scanner(System.in);
        int number=entry.nextInt();
        
        //number is less than 20
        if(number<20){
            System.out.println("sayı 20'den küçüktür");
            //number is equal to 20
        } else if(number==20){
            System.out.println("Sayı 20'e eşittir");
            
                //number is greater than 20
                }else{
            System.out.println("sayı 20'den büyüktür");
        }
        
        
    }
    
}
