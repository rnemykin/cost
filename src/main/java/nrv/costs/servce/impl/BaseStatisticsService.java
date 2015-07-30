package nrv.costs.servce.impl;

import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Audit;
import nrv.costs.domain.statistics.Statistics;
import nrv.costs.servce.StatisticsService;

import java.math.BigDecimal;
import java.util.List;

public abstract class BaseStatisticsService<T extends Audit, V extends Statistics> implements StatisticsService<V> {

    protected StatisticsDao<T> statisticsDao;

    protected abstract void setStatisticsDao(StatisticsDao<T> statisticsDao);

    protected BigDecimal calculateAmountSum(List<T> audits) {
        BigDecimal sum = BigDecimal.ZERO;
        for (T audit : audits) {
            sum = sum.add(audit.getAmount());
        }

        return sum;
    }

}
