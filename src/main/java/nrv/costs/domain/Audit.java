package nrv.costs.domain;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public interface Audit {
    Integer getId();
    String getDescription();
    DateTime getDate();
    BigDecimal getAmount();
}
