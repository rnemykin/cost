package nrv.costs.servce.impl;


import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Category;
import nrv.costs.domain.Income;
import nrv.costs.domain.statistics.IncomeStatistics;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class IncomeStatisticsService extends BaseStatisticsService<Income, IncomeStatistics> {

    @Override
    @Autowired
    protected void setStatisticsDao(StatisticsDao<Income> incomeStatisticsDao) {
        this.statisticsDao = incomeStatisticsDao;
    }


    @Override
    public IncomeStatistics getByCategory(Category.Type category) {
        return new IncomeStatistics();
    }

    @Override
    public IncomeStatistics getFromDate(DateTime from) {
        List<Income> incomes = getFromDateList(from);
        return getStatistics(incomes);
    }

    @Override
    public IncomeStatistics getForCurrentWeek() {
        List<Income> incomes = getForCurrentWeekList();
        return getStatistics(incomes);
    }

    @Override
    public IncomeStatistics getForMonth(DateTime startMonthDate) {
        List<Income> incomes = getFromDateList(startMonthDate);
        return getStatistics(incomes);
    }

    private IncomeStatistics getStatistics(List<Income> incomes) {
        BigDecimal amountSum = calculateAmountSum(incomes);
        return new IncomeStatistics(incomes, amountSum);
    }
}
