package nrv.costs.domain;


import org.joda.time.DateTime;

import java.math.BigDecimal;

public class Income implements Audit {
    private Integer id;
    private BigDecimal amount;
    private DateTime date = new DateTime();
    private String description;
    private Category.Type category;


    public Income(BigDecimal amount, String description) {

    }

    public Income(BigDecimal amount, Category.Type category, String description, DateTime date) {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
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

    public Category.Type getCategory() {
        return category;
    }

    public void setCategory(Category.Type category) {
        this.category = category;
    }
}
