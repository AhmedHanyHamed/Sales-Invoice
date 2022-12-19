
package com.udacity.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int invoNum;
    private String cusName;
    private Date invoDte;
    private ArrayList<InvoiceLine> lines;  

    public InvoiceHeader(int invoNum, String customerName, Date invoDate) {
        this.invoNum = invoNum;
        this.cusName = customerName;
        this.invoDte = invoDate;
        //this.lines = new ArrayList<>();
    }

    public Date getInvDte() {
        return invoDte;
    }

    public void setInvDte(Date invDte) {
        this.invoDte = invoDte;
    }

    public int getInvNum() {
        return invoNum;
    }

    public void setInvNum(int invoNum) {
        this.invoNum = invoNum;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String customerName) {
        this.cusName = customerName;
    }

    @Override
    public String toString() {
        String str = "InvoiceHeader{" + "invoNum=" + invoNum + ", customerName=" + cusName + ", invoDate=" + invoDte + '}';
        for (InvoiceLine line : getLines()) {
            str += "\n\t" + line;
        }
        return str;
    }

    public ArrayList<InvoiceLine> getLines() {
        if (lines == null)
            lines = new ArrayList<>();  // lazy creation
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }

    public double getInvTotal() {
        double total = 0.0;
        for (InvoiceLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public void addInvLine(InvoiceLine line) {
        getLines().add(line);
    }
    
    public String getDataAsCSV() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvNum() + "," + df.format(getInvDte()) + "," + getCusName();
    }
    
}
