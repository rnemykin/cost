package nrv.costs.dao;

import nrv.costs.domain.Cost;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CostDao {
    void insert(Cost cost);
}
