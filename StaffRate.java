package cm;

import java.math.BigDecimal;

public class StaffRate implements IReduction {
    public StaffRate()
    {

    }

    @Override
    public BigDecimal payment(BigDecimal totalCost) {
        if(totalCost.compareTo(new BigDecimal("16.00")) <= 0)
            return totalCost;
        else
            return new BigDecimal("16.00");
    }
}
