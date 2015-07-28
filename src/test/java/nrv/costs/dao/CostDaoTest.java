package nrv.costs.dao;

import nrv.costs.BaseTest;
import nrv.costs.domain.Category;
import nrv.costs.domain.Cost;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class CostDaoTest extends BaseTest {

    @Autowired
    private CostDao dao;

    @Test
    public void testInsert() {
        int id = dao.insert(new Cost(BigDecimal.valueOf(310), Category.Type.FOOD, "Продукты"));
        Assert.assertNotNull("Id is null", id);
    }

}