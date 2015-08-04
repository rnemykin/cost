package nrv.costs.servce;

import nrv.costs.domain.Audit;
import nrv.costs.domain.Category;
import nrv.costs.domain.statistics.Statistics;
import org.joda.time.DateTime;

import java.util.List;

public interface StatisticsService<T extends Audit, V extends  Statistics> {
    V getByCategory(Category.Type category);

    List<T> getFromDate(DateTime from);

    List<T> getForCurrentWeek();

    List<T> getForMonth(DateTime startMonthDate);

}
