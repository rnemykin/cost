package nrv.costs;

import nrv.costs.dao.CategoryDao;
import nrv.costs.dao.CostDao;
import nrv.costs.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    @Autowired
    CategoryDao categoryDao;

    public static enum Type {
        PUBLIC_SERVICE,
        FOOD,
        ENTERTAINMENT,
        CAR,
        HOUSEHOLD_CHEMICALS,
        CLOTHES,
        TRANSPORT,
        CELEBRATION,
        INTERNET,
        MOBILE_NET,
        SPORT
    }

    public String sayHello() {
        categoryDao.insert(new Category(Category.Type.HOUSEHOLD_CHEMICALS, "Бытовая химия, шампунь, зубная паста"));
        return "Hello world!";
    }
}
