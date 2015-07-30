package nrv.costs.dao.statistics.impl;


import nrv.costs.dao.statistics.StatisticsDao;
import nrv.costs.domain.Cost;
import org.springframework.stereotype.Repository;

@Repository
public interface CostStatisticsDao extends StatisticsDao<Cost> {
}
