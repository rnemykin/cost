package nrv.costs.domain.statistics;


import nrv.costs.domain.Income;

import java.math.BigDecimal;
import java.util.List;

public class IncomeStatistics implements Statistics {
    private List<Income> incomes;
    private BigDecimal amountSum;

    public IncomeStatistics() {
    }

    public IncomeStatistics(List<Income> incomes, BigDecimal amountSum) {
        this.incomes = incomes;
        this.amountSum = amountSum;
    }


    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    public BigDecimal getAmountSum() {
        return amountSum;
    }

    public void setAmountSum(BigDecimal amountSum) {
        this.amountSum = amountSum;
    }
}
