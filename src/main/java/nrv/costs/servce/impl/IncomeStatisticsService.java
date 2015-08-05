package nrv.costs.servce.impl;


import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Category;
import nrv.costs.domain.Income;
import nrv.costs.domain.statistics.IncomeStatistics;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IncomeStatisticsService extends BaseStatisticsService<Income, IncomeStatistics> {

    @Override
    @Autowired
    protected void setStatisticsDao(StatisticsDao<Income> incomeStatisticsDao) {
        this.statisticsDao = incomeStatisticsDao;
    }


    @Override
    public IncomeStatistics getByCategory(Category.Type category) {
        return null;
    }

    @Override
    public IncomeStatistics getFromDate(DateTime from) {
        return null;
    }

    @Override
    public IncomeStatistics getForCurrentWeek() {
        return null;
    }

    @Override
    public IncomeStatistics getForMonth(DateTime startMonthDate) {
        return null;
    }
}
