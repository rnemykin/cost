package nrv.costs.dao;

import nrv.costs.RollBackTransactionTest;
import nrv.costs.domain.Category;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryDaoTest extends RollBackTransactionTest {

    @Autowired
    private CategoryDao dao;

    @Test
    public void testInsert() {
        int id = dao.insert(new Category(Category.Type.SALARY, "Зарплата"));
        Assert.assertNotNull("Id is null", id);
    }
}