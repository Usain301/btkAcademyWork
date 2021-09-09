/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

/**
 *
 * @author JET BİLİŞİM
 */
public class Methodss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
         sayiBulmaca();
         sayiBulmaca();
    }
    
    public static void sayiBulmaca(){
    double myList[]={1.0,2.5,3,6,5.4};
        double find=1.0;
        boolean isNumber=false;
        
        for (double findNumber:myList) {
            
            if(findNumber==find){
                
                isNumber=true;
                break;
            
            }
            
        }
        if (isNumber) {
            mesajVer(find);
        }else{
            System.out.println("Mevcut değildir: "+find);}
        
    }
    public static void mesajVer(double find){
    
        System.out.println("sayı mevcuttur: "+ find);
    }
  
}