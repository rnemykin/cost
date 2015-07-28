package nrv.costs.domain;


import org.joda.time.DateTime;

import java.math.BigDecimal;

public class Income {
    private Integer id;
    private BigDecimal amount;
    private DateTime date = new DateTime();
    private String description;


    public Income() {
    }

    public Income(BigDecimal amount, String description) {
        this.amount = amount;
        this.description = description;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
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
