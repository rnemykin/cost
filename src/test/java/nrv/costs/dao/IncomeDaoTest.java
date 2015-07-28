package nrv.costs.dao;


import nrv.costs.BaseTest;
import nrv.costs.domain.Income;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;


public class IncomeDaoTest extends BaseTest {

    @Autowired
    IncomeDao dao;


    @Test
    public void testInsert() {
        int id = dao.insert(new Income(BigDecimal.valueOf(83000.0), "Зарплата за июнь 2015"));
        Assert.assertNotNull("Just inserted id is null", id);
    }
}