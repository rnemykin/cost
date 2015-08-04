package nrv.costs.servce.impl;

import nrv.costs.BaseTest;
import nrv.costs.domain.Category;
import nrv.costs.domain.Cost;
import nrv.costs.domain.statistics.CostStatistics;
import nrv.costs.servce.StatisticsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CostStatisticsServiceTest extends BaseTest {

    @Autowired
    StatisticsService<Cost, CostStatistics> costStatisticsService;


    @Test
    public void testGetByCategory() throws Exception {
        costStatisticsService.getByCategory(Category.Type.FOOD);
    }

    @Test
    public void testFromDate() throws Exception {
        costStatisticsService.getForCurrentWeek();
    }
}