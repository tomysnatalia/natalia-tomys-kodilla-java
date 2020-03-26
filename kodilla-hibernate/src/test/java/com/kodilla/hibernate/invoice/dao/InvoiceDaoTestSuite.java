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

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave () {
        //Given
        Invoice invoice = new Invoice ("05/03/2020");

        Product coffeeIlly = new Product ("Coffee illy");
        Product coffeeLavazza = new Product("Coffee Lavazza");

        Item illy = new Item(coffeeIlly, new BigDecimal(45), 2, new BigDecimal(1));
        Item lavazza = new Item(coffeeLavazza, new BigDecimal(39), 1, new BigDecimal(1));

        illy.setInvoice(invoice);
        lavazza.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(illy);
        items.add(lavazza);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice checkInvoices = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, checkInvoices.getId());
        Assert.assertEquals(2, itemSize);
        Assert.assertEquals(itemSize, checkInvoices.getItems().size());

        //CleanUp
        //
    }
}

