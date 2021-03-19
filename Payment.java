package cm;

import java.math.BigDecimal;

public class Payment {
    private final IReduction reduction;

    public Payment(IReduction reduction)
    {
        this.reduction = reduction;
    }

    public BigDecimal payment(BigDecimal totalCost)
    {
        return reduction.payment(totalCost);
    }
}
