package nrv.costs.dao;

import nrv.costs.domain.Cost;
import org.springframework.stereotype.Repository;

@Repository
public interface CostDao {
    int insert(Cost cost);
}
