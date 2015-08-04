package nrv.costs.domain;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class Cost implements Audit {
    private Integer id;
    private String description = "";
    private DateTime date = new DateTime();
    private BigDecimal amount;
    private Category.Type category;

    public Cost() {
    }

    public Cost(BigDecimal amount, Category.Type category, String description) {
        this.amount = amount;
        this.category = category;
        this.description = description;
    }

    public Cost(BigDecimal amount, Category.Type category, String description, DateTime date) {
        this(amount, category, description);
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
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Category.Type getCategory() {
        return category;
    }

    public void setCategory(Category.Type category) {
        this.category = category;
    }
}
