/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodOrderSystem;

/**
 *
 * @author USER
 */
public class Item {
    String ItemName;
    int Qty;
    int Price;

    public Item(String ItemName, int Qty, int Price) {
        this.ItemName = ItemName;
        this.Qty = Qty;
        this.Price = Price;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

   public String toString(){
   return  getItemName()+" "+getQty()+" "+getPrice();
   }

 
    
}
