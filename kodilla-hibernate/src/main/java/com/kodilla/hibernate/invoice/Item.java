/*
package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private Product product;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
@Id
@NotNull
@GeneratedValue
@Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }
@NotNull
@Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
@NotNull
@Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
@ManyToOne
@JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }
@ManyToOne
@JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
*/
