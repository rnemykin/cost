package nrv.costs.domain.statistics;


import java.math.BigDecimal;

public class CommonStatistics implements Statistics {
    private CostStatistics costStatistics;
    private IncomeStatistics incomeStatistics;
    private BigDecimal profit;

    public CostStatistics getCostStatistics() {
        return costStatistics;
    }

    public void setCostStatistics(CostStatistics costStatistics) {
        this.costStatistics = costStatistics;
    }

    public IncomeStatistics getIncomeStatistics() {
        return incomeStatistics;
    }

    public void setIncomeStatistics(IncomeStatistics incomeStatistics) {
        this.incomeStatistics = incomeStatistics;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getAmountSum() {
        return profit;
    }
}
