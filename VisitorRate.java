package cm;

import java.math.BigDecimal;

public class VisitorRate
{
    public VisitorRate()
    {

    }
    public BigDecimal payment(BigDecimal totalCost)
    {
        BigDecimal freeAmount = new BigDecimal("8");
        BigDecimal reduction = new BigDecimal("0.5");
        if(totalCost.subtract(freeAmount).compareTo(new BigDecimal("0")) <= 0)
            return new BigDecimal("0");
        else
            return (totalCost.subtract(freeAmount)).multiply(reduction);

    }
}
