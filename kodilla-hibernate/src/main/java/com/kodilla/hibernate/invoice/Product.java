/*
package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String Name;
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        Name = name;
    }
@Id
@NotNull
@GeneratedValue
@Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }
@NotNull
@Column(name = "PRODUCT_NAME")
    public String getName() {
        return Name;
    }
@OneToMany(targetEntity = Item.class,
mappedBy = "product",
cascade = CascadeType.ALL,
fetch = FetchType.LAZY
)
    public List<Item> getItems() {
        return items;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        Name = name;
    }
}
*/
