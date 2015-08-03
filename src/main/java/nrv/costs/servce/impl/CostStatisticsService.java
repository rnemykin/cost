package nrv.costs.servce.impl;

import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Category;
import nrv.costs.domain.Cost;
import nrv.costs.domain.statistics.CostStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class CostStatisticsService extends BaseStatisticsService<Cost, CostStatistics> {

    @Override
    @Autowired
    @Qualifier("costStatisticsDao")
    public void setStatisticsDao(StatisticsDao<Cost> statisticsDao) {
        this.statisticsDao = statisticsDao;
    }


    @Override
    public CostStatistics getByCategory(Category.Type category) {
        List<Cost> costs = statisticsDao.getByCategory(category);
        BigDecimal amountSum = calculateAmountSum(costs);
        return new CostStatistics(costs, amountSum);
    }
}
