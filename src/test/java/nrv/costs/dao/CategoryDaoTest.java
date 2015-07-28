package nrv.costs.dao;

import nrv.costs.BaseTest;
import nrv.costs.domain.Category;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryDaoTest extends BaseTest {

    @Autowired
    private CategoryDao dao;

    @Test
    public void testInsert() {
        int id = dao.insert(new Category(Category.Type.CELEBRATION, "Праздники"));
        Assert.assertNotNull("Id is null", id);
    }
}