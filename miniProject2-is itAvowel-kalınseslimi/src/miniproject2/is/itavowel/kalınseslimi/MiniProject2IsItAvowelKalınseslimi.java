/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject2.is.itavowel.kalınseslimi;
import java.util.Scanner;

/**
 *
 * @author JET BİLİŞİM
 */
public class MiniProject2IsItAvowelKalınseslimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader=new Scanner(System.in);
        char c = reader.next().charAt(0);
        
        switch(c){
            case 'A':
            case 'I':
                case 'O':
                case 'U':
                    System.out.println("Sesli Harftir");
                    break;
                default:
                        System.out.println("sesli harf değildir");
                    
                    
        }
    }
    
}
