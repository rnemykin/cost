package nrv.costs.domain;


import org.joda.time.DateTime;

import java.math.BigDecimal;

public class Income implements Audit {
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


    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
