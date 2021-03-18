package cm;

import java.math.BigDecimal;

public class ManagementRate {
    public ManagementRate()
    {

    }

    public BigDecimal payment(BigDecimal totalCost)
    {
        if(totalCost.compareTo(new BigDecimal("3.00")) <= 0)
            return new BigDecimal("3.00");
        else
            return totalCost;
    }
}
