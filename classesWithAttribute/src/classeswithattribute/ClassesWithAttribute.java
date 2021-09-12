/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeswithattribute;

/**
 *
 * @author JET BİLİŞİM
 */
public class ClassesWithAttribute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Product product=new Product("Laptop", 0, 0, "Computer", 0);
        product.setName("Laptop");
        product.setId(1);
        product.setPrice(100000);
        product.setStockAmount(20);
        product.setDescprition("BİLGİSAYQAR");
        
               ProductManager productManager=new ProductManager();
        
        productManager.add(product);
        
        
        
        
    }
    
}
