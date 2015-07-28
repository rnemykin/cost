package nrv.costs.dao;


import nrv.costs.domain.Income;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeDao {
    public int insert(Income income);
}
