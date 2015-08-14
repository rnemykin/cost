package nrv.costs.dao;

import nrv.costs.BaseTest;
import nrv.costs.domain.Category;
import nrv.costs.domain.Cost;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class CostDaoTest extends BaseTest {

    @Autowired
    private CostDao dao;

    @Test
    public void testInsert() {
        DateTime dt = FORMATTER.parseDateTime("09-08-2015");
        int id = dao.insert(new Cost(BigDecimal.valueOf(800), Category.Type.ENTERTAINMENT, "Рабылка, день строителя, бензин",dt));
        Assert.assertNotNull("Id is null", id);
    }

}