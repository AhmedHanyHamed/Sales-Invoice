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


public class InvoiceHeaderDialog extends JDialog {
    private JTextField cusNField;
    private JTextField invoDateField;
    private JLabel custNameLbl;
    private JLabel invoDateLbl;
    private JButton ookBtn;
    private JButton cancellBtn;

    public InvoiceHeaderDialog(InvoiceFrame frame) {
        custNameLbl = new JLabel("Customer Name:");
        cusNField = new JTextField(20);
        invoDateLbl = new JLabel("Invoice Date:");
        invoDateField = new JTextField(20);
        ookBtn = new JButton("OK");
        cancellBtn = new JButton("Cancel");
        
        ookBtn.setActionCommand("createInvOK");
        cancellBtn.setActionCommand("createInvCancel");
        
        ookBtn.addActionListener(frame.getListener());
        cancellBtn.addActionListener(frame.getListener());
        setLayout(new GridLayout(3, 2));
        
        add(invoDateLbl);
        add(invoDateField);
        add(custNameLbl);
        add(cusNField);
        add(ookBtn);
        add(cancellBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return cusNField;
    }

    public JTextField getInvDateField() {
        return invoDateField;
    }
    
}
