/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableargumentsmethod;

/**
 *
 * @author JET BİLİŞİM
 */
public class VariableArgumentsMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int total1=total(1,3,4,1,24,1,2,3,4,1,2,4,34234);
        System.out.println(total1);
        
        
    }
    public static int total(int... numbers){
       int total=0;
        for(int number:numbers){
            total+=number;
           
        }
               return total;  
    
    }
    
}
