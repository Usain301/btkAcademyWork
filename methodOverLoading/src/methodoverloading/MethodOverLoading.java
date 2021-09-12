/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author JET BİLİŞİM
 */
public class MethodOverLoading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FourTransactions fourTransactions=new FourTransactions();
        
        System.out.println(fourTransactions.total(0, 0)); 
        System.out.println(fourTransactions.total(02, 2, 2));
    }
    
}
