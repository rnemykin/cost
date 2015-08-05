package nrv.costs.servce.impl;

import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Audit;
import nrv.costs.domain.statistics.Statistics;
import nrv.costs.servce.StatisticsService;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

import java.math.BigDecimal;
import java.util.List;

public abstract class BaseStatisticsService<T extends Audit, V extends Statistics> implements StatisticsService<V> {

    protected StatisticsDao<T> statisticsDao;

    protected abstract void setStatisticsDao(StatisticsDao<T> statisticsDao);


    protected List<T> getFromDateList(DateTime from) {
        return statisticsDao.getFromToDate(from, new DateTime());
    }

    protected List<T> getForCurrentWeekList() {
        DateInterval week = get4Week();
        return statisticsDao.getFromToDate(week.from, week.to);
    }

    protected List<T> getForMonthList(DateTime startMonthDate) { //  todo may be int month
        DateInterval month = get4Month(startMonthDate);
        return statisticsDao.getFromToDate(month.from, month.to);
    }

    public DateInterval get4Week() {
        DateTime now = DateTime.now().withTimeAtStartOfDay();
        DateTime from = now.dayOfWeek().withMinimumValue();
        DateTime to = now.dayOfWeek().withMaximumValue().withTime(new LocalTime(23, 59 ,59));
        return new DateInterval(from, to);
    }

    protected DateInterval get4Month(DateTime startMonthDate) {
        DateTime from = startMonthDate.withTimeAtStartOfDay();
        DateTime to = startMonthDate.dayOfMonth().withMaximumValue().withTime(new LocalTime(23, 59, 59));
        return new DateInterval(from, to);
    }

    protected BigDecimal calculateAmountSum(List<T> audits) {
        BigDecimal sum = BigDecimal.ZERO;
        for (T audit : audits) {
            sum = sum.add(audit.getAmount());
        }

        return sum;
    }


    private static class DateInterval {
        DateTime from;
        DateTime to;

        public DateInterval(DateTime from, DateTime to) {
            this.from = from;
            this.to = to;
        }
    }

}
