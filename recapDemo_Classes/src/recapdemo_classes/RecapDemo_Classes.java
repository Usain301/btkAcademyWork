/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recapdemo_classes;

/**
 *
 * @author JET BİLİŞİM
 */
public class RecapDemo_Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DortIslem dortIslem=new DortIslem();
        int sonuc=dortIslem.toplam(5, 5);
        int sonuc1=dortIslem.çıkarma(5, 5);
        int sonuc2=dortIslem.çarpma(5, 5);
        int sonuc3=dortIslem.bölme(5, 5);
        
        System.out.println(sonuc);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
    }
    
}
