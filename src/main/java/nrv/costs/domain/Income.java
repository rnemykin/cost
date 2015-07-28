package nrv.costs.domain;


import org.joda.time.DateTime;

public class Income {
    private Integer id;
    private Double amount;
    private DateTime date = new DateTime();
    private String description;


    public Income() {
    }

    public Income(Double amount, String description) {
        this.amount = amount;
        this.description = description;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
