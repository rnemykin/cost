package nrv.costs.servce.impl;

import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Audit;
import nrv.costs.domain.statistics.Statistics;
import nrv.costs.servce.StatisticsService;
import org.joda.time.DateTime;

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

    protected DateInterval get4Week() {
        DateTime now = new DateTime();
        return new DateInterval(now.dayOfWeek().withMinimumValue(), now.dayOfWeek().withMaximumValue());
    }

    protected DateInterval get4Month(DateTime startMonthDate) {
        return new DateInterval(startMonthDate, startMonthDate.dayOfMonth().withMaximumValue());
    }


    class DateInterval {
        DateTime from;
        DateTime to;

        public DateInterval(DateTime from, DateTime to) {
            this.from = from;
            this.to = to;
        }
    }

}
