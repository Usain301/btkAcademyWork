/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject3.perfectnumber.mükemmelsayı;

/**
 *
 * @author JET BİLİŞİM
 */
public class MiniProject3PerfectNumberMükemmelSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //6=1,2,3
        //28=1,2,4,7,14
        int number=5;
        int total=0;
        
        
        
        for (int i = 1; i < number; i++) {
            if (number%i==0) {
                total=total+i;
                
                
                
            }
        }
        if (total==number) {
            System.out.println("mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");}
        
        
    }
    
}
