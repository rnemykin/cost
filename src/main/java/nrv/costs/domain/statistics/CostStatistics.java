package nrv.costs.domain.statistics;


import nrv.costs.domain.Cost;

import java.math.BigDecimal;
import java.util.List;

public class CostStatistics implements Statistics {
    private List<Cost> costs;
    private BigDecimal amountSum;

    public CostStatistics() {
    }

    public CostStatistics(List<Cost> costs, BigDecimal amountSum) {
        this.costs = costs;
        this.amountSum = amountSum;
    }

    public List<Cost> getCosts() {
        return costs;
    }


    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }

    public BigDecimal getAmountSum() {
        return amountSum;
    }

    public void setAmountSum(BigDecimal amountSum) {
        this.amountSum = amountSum;
    }
}
