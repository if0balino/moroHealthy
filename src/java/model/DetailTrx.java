/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DB1407
 */
public class DetailTrx {
    private int id;
    private int trxId;
    private int itemId;
    private int subtotal;
    private int qty;

    public DetailTrx(int id, int trxId, int itemId, int subtotal, int qty) {
        this.id = id;
        this.trxId = trxId;
        this.itemId = itemId;
        this.subtotal = subtotal;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrxId() {
        return trxId;
    }

    public void setTrxId(int trxId) {
        this.trxId = trxId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
}
