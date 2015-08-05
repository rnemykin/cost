package nrv.costs.servce;

import nrv.costs.domain.Category;
import nrv.costs.domain.statistics.Statistics;
import org.joda.time.DateTime;

public interface StatisticsService<T extends Statistics> {
    T getByCategory(Category.Type category);

    T getFromDate(DateTime from);

    T getForCurrentWeek();

    T getForMonth(DateTime startMonthDate);

}
