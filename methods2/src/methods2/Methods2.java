/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods2;

/**
 *
 * @author JET BİLİŞİM
 */
public class Methods2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String message="Bugün hava çok Güzel";
        String message1=message.substring(0, 2);
        String newMassage=City();
        int number=total(2,2);
        System.out.println(number);
        
        System.out.println(newMassage);
        System.out.println(message1);
    }
    public static void add(){
        System.out.println("Product Added");
    }
    public static void remove(){
        System.out.println("Product has been delete");
    
    }
    public static void update(){
        System.out.println("product updated");
    }
    public static int total(int number1 ,int number2){
    
        return number1+number2;
    }
    public static String City(){
    
    return"New york City";
    }
    
}
