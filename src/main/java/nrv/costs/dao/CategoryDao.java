package nrv.costs.dao;

import nrv.costs.domain.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao {
    int insert(Category category);
}
