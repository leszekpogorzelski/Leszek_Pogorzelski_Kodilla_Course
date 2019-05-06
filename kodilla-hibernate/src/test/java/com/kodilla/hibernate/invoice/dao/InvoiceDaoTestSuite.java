package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("1/05/2019");
        invoiceDao.save(invoice);

        Product product = new Product("Rower");
        Product product1 = new Product("Hulajnoga");
        Product product2 = new Product("Rolki");

        Item item = new Item(new BigDecimal(1000), 2);
        Item item1 = new Item(new BigDecimal(500), 3);
        Item item2 = new Item(new BigDecimal(750), 5);

        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);
        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        product.getItems().add(item);
        product1.getItems().add(item2);
        product2.getItems().add(item2);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);
        itemDao.save(item);
        itemDao.save(item1);
        itemDao.save(item2);
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int productId = product.getId();
        int product1ID = product1.getId();
        int product2ID = product2.getId();

        int invoiceItems = invoice.getItems().size();
        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(3, invoiceItems);
        //Clean
        try {
            invoiceDao.deleteById(invoiceId);
            productDao.deleteById(productId);
            productDao.deleteById(product1ID);
            productDao.deleteById(product2ID);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
