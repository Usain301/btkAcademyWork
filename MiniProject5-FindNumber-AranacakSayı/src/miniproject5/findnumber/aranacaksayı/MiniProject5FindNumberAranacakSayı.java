/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject5.findnumber.aranacaksayı;

/**
 *
 * @author JET BİLİŞİM
 */
public class MiniProject5FindNumberAranacakSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double myList[]={1.0,2.5,3,6,5.4};
        double find=2.0;
        boolean isNumber=false;
        
        for (double findNumber:myList) {
            
            if(findNumber==find){
                
                isNumber=true;
                break;
            
            }
            
        }
        if (isNumber) {
            System.out.println("sayı mevcuttur");
        }else{
            System.out.println("Mevcut değildir");}
        
    }
    
}
