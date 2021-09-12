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
public class Product {
    
    public Product(String name,int ıd,int stockAmount,String descprition,int price){
        this.descprition=descprition;
        this.name=name;
        this.stockAmount=stockAmount;
        this.price=price;
        this.ıd=ıd;
        
    }
    
    
    private String name;
    private int ıd;
    private int stockAmount;
    private String descprition;
    private int price;
    
    //getter
    public int getId(){
     return ıd;
    
    }
    //setter
    public void setId(int ıd){
    
       this.ıd=ıd;
    
    
    }
    
    //this. bloğu bu blok için geçerli demek

    /**
     * @return the stockAmount
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * @param stockAmount the stockAmount to set
     */
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * @return the descprition
     */
    public String getDescprition() {
        return descprition;
    }

    /**
     * @param descprition the descprition to set
     */
    public void setDescprition(String descprition) {
        this.descprition = descprition;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
