/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udacity.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvoiceLineDialog extends JDialog{
    private JTextField itemNameF;
    private JTextField itemCountF;
    private JTextField itemPriceF;
    private JLabel itemNameL;
    private JLabel itemCountL;
    private JLabel itemPriceL;
    private JButton ookBt;
    private JButton cancellBt;
    
    public InvoiceLineDialog(InvoiceFrame frame) {
        itemNameF = new JTextField(20);
        itemNameL = new JLabel("Item Name");
        
        itemCountF = new JTextField(20);
        itemCountL = new JLabel("Item Count");
        
        itemPriceF = new JTextField(20);
        itemPriceL = new JLabel("Item Price");
        
        ookBt = new JButton("OK");
        cancellBt = new JButton("Cancel");
        
        ookBt.setActionCommand("createLineOK");
        cancellBt.setActionCommand("createLineCancel");
        
        ookBt.addActionListener(frame.getListener());
        cancellBt.addActionListener(frame.getListener());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameL);
        add(itemNameF);
        add(itemCountL);
        add(itemCountF);
        add(itemPriceL);
        add(itemPriceF);
        add(ookBt);
        add(cancellBt);
        
        pack();
    }

    public JTextField getItemNameField() {
        return itemNameF;
    }

    public JTextField getItemCountField() {
        return itemCountF;
    }

    public JTextField getItemPriceField() {
        return itemPriceF;
    }
}
