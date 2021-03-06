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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave () {
        //Given
        Invoice invoices = new Invoice ("05/03/2020");

        Product coffeeIlly = new Product ("Coffee illy");
        Product coffeeLavazza = new Product("Coffee Lavazza");

        Item illy = new Item(new BigDecimal(45), 2, new BigDecimal(1));
        Item lavazza = new Item(new BigDecimal(39), 1, new BigDecimal(1));


        illy.setInvoice(invoices);
        lavazza.setInvoice(invoices);

        illy.setProduct(coffeeIlly);
        lavazza.setProduct(coffeeLavazza);

        List<Item> items = new ArrayList<>();
        items.add(illy);
        items.add(lavazza);

        invoices.setItems(items);

        //When
        invoiceDao.save(invoices);
        int id = invoices.getId();
        int itemSize = invoices.getItems().size();


        Invoice checkInvoices = invoiceDao.findById(id);

        //Then
        Assert.assertEquals(id, checkInvoices.getId());
        Assert.assertEquals(2, itemSize);
        Assert.assertEquals(itemSize, checkInvoices.getItems().size());

        //CleanUp
        invoiceDao.deleteById(id);
    }
}

