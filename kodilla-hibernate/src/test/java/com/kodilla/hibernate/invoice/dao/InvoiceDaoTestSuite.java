package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product productNo1 = new Product("Product No. 1");
        Product productNo2 = new Product("Product No. 2");
        Product productNo3 = new Product("Product No. 3");

        Item itemNo1 = new Item(new BigDecimal(1), 10,new BigDecimal(10));
        itemNo1.setProduct(productNo1);

        Item itemNo2 = new Item(new BigDecimal(2), 20, new BigDecimal(40));
        itemNo2.setProduct(productNo2);

        Item itemNo3 = new Item(new BigDecimal(3), 30, new BigDecimal(90));
        itemNo3.setProduct(productNo3);

        Invoice invoiceNo1 = new Invoice("Invoice No. 1");
        invoiceNo1.getItems().add(itemNo1);
        invoiceNo1.getItems().add(itemNo2);
        invoiceNo1.getItems().add(itemNo3);

        itemNo1.setInvoice(invoiceNo1);
        itemNo2.setInvoice(invoiceNo1);
        itemNo3.setInvoice(invoiceNo1);
        //When
        invoiceDao.save(invoiceNo1);
        int invoiceNo1Id = invoiceNo1.getId();
        //Then
        assertNotEquals(0, invoiceNo1Id);
        //CleanUp
        invoiceDao.delete(invoiceNo1);
    }
}