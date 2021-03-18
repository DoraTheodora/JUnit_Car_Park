package cm;

import java.math.BigDecimal;

public class StudentRate implements IReduction {
    public StudentRate()
    {

    }

    @Override
    public BigDecimal payment(BigDecimal totalCost)
    {
        BigDecimal noDiscount = new BigDecimal("5.50");
        BigDecimal reduction = new BigDecimal("0.75");
        if(totalCost.subtract(noDiscount).compareTo(new BigDecimal("0.00")) <= 0)
            return totalCost;
        else
            return (totalCost.subtract(noDiscount)).multiply(reduction);
    }
}
