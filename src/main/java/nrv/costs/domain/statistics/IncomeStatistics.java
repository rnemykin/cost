package nrv.costs.domain.statistics;


import nrv.costs.domain.Income;

import java.math.BigDecimal;
import java.util.List;

public class IncomeStatistics implements Statistics {
    private List<Income> income;
    private BigDecimal amountSum;


    public List<Income> getCosts() {
        return income;
    }

    public void setCosts(List<Income> income) {
        this.income = income;
    }

    public BigDecimal getAmountSum() {
        return amountSum;
    }

    public void setAmountSum(BigDecimal amountSum) {
        this.amountSum = amountSum;
    }
}
