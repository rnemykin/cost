package nrv.costs;

import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class RollBackTransactionTest extends BaseTest {
}
