package cm;

import java.math.BigDecimal;

public class VisitorRate implements IReduction {
    public VisitorRate()
    {

    }
    
    @Override
    public BigDecimal payment(BigDecimal totalCost)
    {
        BigDecimal freeAmount = new BigDecimal("8.00");
        BigDecimal reduction = new BigDecimal("0.50");
        if(totalCost.subtract(freeAmount).compareTo(new BigDecimal("0.00")) <= 0)
            return new BigDecimal("0.00");
        else
            return (totalCost.subtract(freeAmount)).multiply(reduction);

    }
}
