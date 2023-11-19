import java.time.LocalDate;
public class Invoice_system3 {
    private String invoiceID;
    private int houseOwnerID;
    private LocalDate date;
    private String paymentStatus;

    //constructor
    public Invoice_system3(String id, int ownerid, LocalDate invoiceDate, String payment) {
        invoiceID = id;
        houseOwnerID = ownerid;
        date = invoiceDate;
        paymentStatus = payment;
    }

    //method
    public String getInvoiceID()
    {
        return invoiceID;
    }
    public void setInvoiceID(String invoiceID)
    {
        this.invoiceID = invoiceID;
    }
    
    public int getHouseOwnerID()
    {
        return houseOwnerID;
    }
    public void setHouseOwnerID(int houseOwnerID)
    {
        this.houseOwnerID = houseOwnerID;
    }

    public LocalDate getDate()
    {
        return date;
    }
    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public String getPaymentStatus()
    {
        return paymentStatus;
    }
    public void setaPymentStatus(String paymentStatus)
    {
        this.paymentStatus = paymentStatus;
    }

