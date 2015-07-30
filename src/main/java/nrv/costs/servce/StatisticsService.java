package nrv.costs.servce;

import nrv.costs.domain.Category;
import nrv.costs.domain.statistics.Statistics;

public interface StatisticsService<T extends Statistics> {
    T getByCategory(Category.Type category);
}
