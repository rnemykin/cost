package nrv.costs.dao.statistics.impl;

import nrv.costs.BaseTest;
import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Category;
import nrv.costs.domain.Cost;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CostStatisticsDaoTest extends BaseTest {

    @Autowired
    StatisticsDao<Cost> costStatisticsDao;


    @Test
    public void testGetByCategory() {
        List<Cost> costs = costStatisticsDao.getByCategory(Category.Type.FOOD.name());
    }

    @Test
    public void testGetFromToDate() {
        DateTime from = FORMATTER.parseDateTime("1-07-2015");

        costStatisticsDao.getFromToDate(from, new DateTime());
        //  todo create getFromDate(DateTime)
    }
}