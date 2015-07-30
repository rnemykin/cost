package nrv.costs.dao.statistics;


import nrv.costs.domain.Audit;

import java.util.List;

public interface StatisticsDao<T extends Audit> {
//    List<T> getForCurrentWeek();
//    List<T> getForMonth(int month);
//    List<T> getFromToDate(DateTime from, DateTime to);
    List<T> getByCategory(String category);
}