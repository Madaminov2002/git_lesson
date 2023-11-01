public class Payment {
    private String accFrom;
    private String accTo;
    private Double amount;

    public Payment(String accFrom, String accTo, Double amount) {
        this.accFrom = accFrom;
        this.accTo = accTo;
        this.amount = amount;
        //ss
    }

    public String getAccFrom() {
        return accFrom;
    }

    public void setAccFrom(String accFrom) {
        this.accFrom = accFrom;
    }

    public String getAccTo() {
        return accTo;
    }

    public void setAccTo(String accTo) {
        this.accTo = accTo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
