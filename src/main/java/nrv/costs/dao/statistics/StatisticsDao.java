package nrv.costs.dao.statistics;


import nrv.costs.domain.Audit;
import nrv.costs.domain.Category;
import org.apache.ibatis.annotations.Param;
import org.joda.time.DateTime;

import java.util.List;

public interface StatisticsDao<T extends Audit> {
//    List<T> getForCurrentWeek();
//    List<T> getForMonth(int month);
    List<T> getFromToDate(@Param("from") DateTime from, @Param("to") DateTime to);
    List<T> getByCategory(Category.Type category);
}
