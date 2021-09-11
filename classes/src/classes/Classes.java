/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author JET BİLİŞİM
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //bellek stock ve heap
        
        CustomerManager customerManager=new CustomerManager();
        customerManager.remove();
        customerManager.add();
        customerManager.update();
        
        //value type
        int number1=10;
        int number2=20;
        number2=number1;
         number1=30;
         System.out.println(number2);
         
         //referance type
         int[] numbers1=new int[]{1,2,3};
         int[] numbers2=new int[]{4,5,6};
         numbers2=numbers1;
         numbers1[0]=10;
         System.out.println(numbers2[0]);
                 

        
        
        
    }
    
}
