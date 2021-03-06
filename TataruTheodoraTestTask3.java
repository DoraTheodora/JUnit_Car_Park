package cm;
// Theodora Tataru
// C00231174	

// 17 February 2021

import org.junit.Test;
import org.junit.Assert;
import java.math.BigDecimal;
import java.util.ArrayList;


public class TataruTheodoraTestTask3
{
	Rate testRate;
	
	@Test()
	public void Test1Rate()  throws IllegalArgumentException
	{
		//	Partitioned Test -> normalRate >= reducedRate
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT; 
		BigDecimal normalRate = new BigDecimal(3);
		BigDecimal reducedRate = new BigDecimal(1);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate, reducedPeriods, normalPeriods);
	}
	
	@Test()
	public void Test2Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalRate == reducedRate
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(1);
		BigDecimal reducedRate = new BigDecimal(1);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test()
	public void Test3Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalRate == 0
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(0);
		BigDecimal reducedRate = new BigDecimal(0);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));

		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test()
	public void Test4Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> reducedRate == 0
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(1);
		BigDecimal reducedRate = new BigDecimal(0);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));

		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test5Rate() throws IllegalArgumentException
	{

		//	Partitioned Test -> normalRate < 0
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(-1);
		BigDecimal reducedRate = new BigDecimal(1);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test6Rate() throws IllegalArgumentException
	{

		//	Partitioned Test -> reducedRate < 0
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(1);
		BigDecimal reducedRate = new BigDecimal(-1);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test7Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalRate < reducedRate
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(1);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test()
	public void Test8Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalPeriods do not overlap the reducedPeriods
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test9Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalPeriods overlap the reducedPeriods
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,15)); 
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test()
	public void Test10Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalPeriods == ()
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(8,12));
		
		//when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test()
	public void Test11Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> reducedPeriods == ()
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test()
	public void Test12Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> kind == STAFF
		//	given
		CarParkKind parkKind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12)); 
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test13Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalPeriods = null
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = null;
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test14Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> reducedPeriods = null
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		ArrayList<Period> reducedPeriods = null;
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test15Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalRate = null
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = null;
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test16Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> reducedRate = null
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(1);
		BigDecimal reducedRate = null;
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,12));
		normalPeriods.add(new Period(17,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
    @Test()
    public void Test17Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> reducedRate = has decimal point
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(3.5);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8,12));
        normalPeriods.add(new Period(17,20));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12,17));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test()
    public void Test18Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> normalRate = has decimal point
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9.5);
        BigDecimal reducedRate = new BigDecimal(6);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8,12));
        normalPeriods.add(new Period(17,20));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12,17));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Test19Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> normalPeriods overlap
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9.5);
        BigDecimal reducedRate = new BigDecimal(6);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8,12));
        normalPeriods.add(new Period(11,15));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(15,17));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Test20Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> reducedPeriods overlap
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9.5);
        BigDecimal reducedRate = new BigDecimal(6);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8,12));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(12,17));
        reducedPeriods.add(new Period(15,20));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Test21Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> normalPeriods invalid (startRate > endRate)
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9.5);
        BigDecimal reducedRate = new BigDecimal(6);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(12,8));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17,19));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Test22Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> reducedPeriods invalid (startRate > endRate)
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9.5);
        BigDecimal reducedRate = new BigDecimal(6);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8,12));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(19,12));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Test23Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> reducedPeriods invalid (startRate == endRate)
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9.5);
        BigDecimal reducedRate = new BigDecimal(6);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(8,12));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(19,19));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Test24Rate() throws IllegalArgumentException
    {
        //	Partitioned Test -> normalPeriods invalid (startRate == endRate)
        //	given
        CarParkKind parkKind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal(9.5);
        BigDecimal reducedRate = new BigDecimal(6);
        ArrayList<Period> normalPeriods = new ArrayList<>();
        normalPeriods.add(new Period(12,12));
        ArrayList<Period> reducedPeriods = new ArrayList<>();
        reducedPeriods.add(new Period(17,19));

        //	when
        testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
    }
    @Test(expected = IllegalArgumentException.class)
	public void Test25Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalPeriods does overlap normalPeriods
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(9.5);
		BigDecimal reducedRate = new BigDecimal(6);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(9,12));
		normalPeriods.add(new Period(11,15));
		normalPeriods.add(new Period(15,18));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(18,20));

		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	@Test(expected = IllegalArgumentException.class)
	public void Test26Rate() throws IllegalArgumentException
	{
		//	Partitioned Test -> normalPeriods overlap the reducedPeriods
		//	given
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(4);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8,15));
		normalPeriods.add(new Period(15,20));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(19,21));
		reducedPeriods.add(new Period(21,22));

		//	when
		testRate = new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	//	Precondition: a rate object needs to be created to test the calculate() method
	public Rate rateObject_Visitor()
	{
		CarParkKind parkKind = CarParkKind.VISITOR;
		BigDecimal normalRate = new BigDecimal(9);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8, 12));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));
		
		//	when
		return new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}
	
	@Test
	public void Test1CalculateVisitor() throws IllegalArgumentException
	{
		// 	Partitioned Test -> startHour < endHour
		// 	12 euro in total
		// 	8 free -> 12 - 8 = 4
		// 	50% off = 4 * 0.5 = 2
		
		//	given
		Rate rate = rateObject_Visitor();
		int startHour = 11;
		int endHour = 12;
		
		//	when
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);
		
		//	then
        BigDecimal expectedCost = new BigDecimal("0.50");
        Assert.assertEquals(expectedCost, realCost);
	}
	
	@Test
	public void Test2CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == 0
		// 	51 euro in total
		// 	8 free -> 51 - 8 = 43
		// 	50% off = 43 * 0.5 = 21.5
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = 0;
		int endHour = 20;
		Period car1 = new Period(startHour, endHour);
        BigDecimal realCost = rate.calculate(car1);

        //	then
        BigDecimal expectedCost = new BigDecimal("21.50");
        Assert.assertEquals(expectedCost, realCost);
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void Test3CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 0
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = 0;
		int endHour = 0;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test4CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == endHour
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = 17;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);
		
		//	then
	    rate.calculate(car1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test5CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > endHour
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = 19;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);
		
		//	then
	    rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test6CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour < 0
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = -2;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);
		
		//	then
	    rate.calculate(car1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test7CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > 24
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = 25;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);
		
		//then
	    rate.calculate(car1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test8CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour < 0
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = 13;
		int endHour = -1;
		Period car1 = new Period(startHour, endHour);
		
		//	then
	    rate.calculate(car1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void Test9CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour > 24
		
		//	given
		Rate rate = rateObject_Visitor();
		
		//	when
		int startHour = 13;
		int endHour = 26;
		Period car1 = new Period(startHour, endHour);
		
		//	then
	    rate.calculate(car1);
	}
	@Test
	public void Test10CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 24
		// 	51 euro in total
		// 	8 free -> 51 - 8 = 43
		// 	50% off = 43 * 0.5 = 21.5

		//	given
		Rate rate = rateObject_Visitor();

		//	when
		int startHour = 3;
		int endHour = 24;
		Period car1 = new Period(startHour, endHour);
        BigDecimal realCost = rate.calculate(car1);

        //	then
        BigDecimal expectedCost = new BigDecimal("21.50");
        Assert.assertEquals(expectedCost, realCost);
	}
    @Test
    public void Test11CalculateVisitor() throws IllegalArgumentException
    {
        //	Partitioned Test -> startHour && endHour outside paying periods

        //	given
        Rate rate = rateObject_Visitor();

        //	when
        int startHour = 19;
        int endHour = 21;
        Period car1 = new Period(startHour, endHour);
        BigDecimal realCost = rate.calculate(car1);

        //	then
        BigDecimal expectedCost = new BigDecimal("0.00");
        Assert.assertEquals(expectedCost, realCost);
    }
    @Test
    public void Test12CalculateVisitor() throws IllegalArgumentException
    {
        //	Partitioned Test -> startHour && endHour cover all day
		// 	51 euro in total
		// 	8 free -> 51 - 8 = 43
		// 	50% off = 43 * 0.5 = 21.5

        //	given
        Rate rate = rateObject_Visitor();

        //	when
        int startHour = 0;
        int endHour = 24;
        Period car1 = new Period(startHour, endHour);
        BigDecimal realCost = rate.calculate(car1);

        //	then
        BigDecimal expectedCost = new BigDecimal("21.50");
        Assert.assertEquals(expectedCost, realCost);
    }
	@Test
	public void Test13CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the normal period
		// 	18 euro in total
		// 	8 free -> 18 - 8 = 10
		//	 50% off = 10 * 0.5 = 5

		//	given
		Rate rate = rateObject_Visitor();

		//	when
		int startHour = 9;
		int endHour = 11;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("5.00");
		Assert.assertEquals(expectedCost, realCost);
	}
	@Test
	public void Test14CalculateVisitor() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the reduced period
		// 	9 euro in total
		// 	8 free -> 9 - 8 = 1
		// 	50% off = 1 * 0.5 = 0.5

		//	given
		Rate rate = rateObject_Visitor();

		//	when
		int startHour = 13;
		int endHour = 16;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("0.50");
		Assert.assertEquals(expectedCost, realCost);
	}

	//	Precondition: a rate object needs to be created to test the calculate() method
	public Rate rateObject_Management()
	{
		CarParkKind parkKind = CarParkKind.MANAGEMENT;
		BigDecimal normalRate = new BigDecimal(9);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8, 12));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));

		//	when
		return new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test
	public void Test1CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour < endHour
		// 	9 euro total

		//	given
		Rate rate = rateObject_Management();
		int startHour = 11;
		int endHour = 12;

		//	when
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("9.00");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test2CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == 0
		//	 51 euro in total

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 0;
		int endHour = 20;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("51.00");
		Assert.assertEquals(expectedCost, realCost);
	}


	@Test(expected = IllegalArgumentException.class)
	public void Test3CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 0

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 0;
		int endHour = 0;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test4CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == endHour

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 17;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test5CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > endHour

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 19;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test6CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour < 0

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = -2;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test7CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > 24

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 25;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test8CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour < 0

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 13;
		int endHour = -1;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test9CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour > 24

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 13;
		int endHour = 26;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}
	@Test
	public void Test10CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 24
		// 	51 euro in total

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 3;
		int endHour = 24;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("51.00");
		Assert.assertEquals(expectedCost, realCost);
	}
	@Test
	public void Test11CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour && endHour outside paying periods

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 19;
		int endHour = 21;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("3.00");
		Assert.assertEquals(expectedCost, realCost);
	}
	@Test
	public void Test12CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour && endHour cover all day
		//	51 euro in total


		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 0;
		int endHour = 24;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("51.00");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test13CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the normal period
		// 	18 euro in total

		//	given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 9;
		int endHour = 11;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("18.00");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test14CalculateManagement() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the reduced period
		// 	9 euro in total

		//given
		Rate rate = rateObject_Management();

		//	when
		int startHour = 13;
		int endHour = 16;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("9.00");
		Assert.assertEquals(expectedCost, realCost);
	}

	//	Precondition: a rate object needs to be created to test the calculate() method
	public Rate rateObject_Student()
	{
		CarParkKind parkKind = CarParkKind.STUDENT;
		BigDecimal normalRate = new BigDecimal(9);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8, 12));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));

		//	when
		return new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test
	public void Test1CalculateStudent() throws IllegalArgumentException
	{
		// 	Partitioned Test -> startHour < endHour
		// 	9 euro total
		// 	reduction for -> 9 - 5.5 = 3.5
		//	reduction applied -> 3.5 * 0.75 = 2.625

		//	given
		Rate rate = rateObject_Student();
		int startHour = 11;
		int endHour = 12;

		//	when
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("2.63");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test2CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == 0
		// 	51 euro in total
		// 	reduction for -> 51 - 5.5 = 45.5
		//	reduction applied -> 45.5 * 0.75 = 34.125

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 0;
		int endHour = 20;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("34.13");
		Assert.assertEquals(expectedCost, realCost);
	}


	@Test(expected = IllegalArgumentException.class)
	public void Test3CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 0

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 0;
		int endHour = 0;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test4CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == endHour

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 17;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test5CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > endHour

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 19;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test6CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour < 0

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = -2;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test7CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > 24

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 25;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test8CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour < 0

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 13;
		int endHour = -1;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test9CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour > 24

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 13;
		int endHour = 26;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}
	@Test
	public void Test10CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 24
		// 	51 euro in total
		// 	reduction for -> 51 - 5.5 = 45.5
		//	reduction applied -> 45.5 * 0.75 = 34.125

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 3;
		int endHour = 24;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("34.13");
		Assert.assertEquals(expectedCost, realCost);
	}
	@Test
	public void Test11CalculateStudent() throws IllegalArgumentException
	{
		//Partitioned Test -> startHour && endHour outside paying periods
		// 	0 euro in total

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 19;
		int endHour = 21;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("0.00");
		Assert.assertEquals(expectedCost, realCost);
	}
	@Test
	public void Test12CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour && endHour cover all day
		// 	51 euro in total
		// 	reduction for -> 51 - 5.5 = 45.5
		//	reduction applied -> 45.5 * 0.75 = 34.125


		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 0;
		int endHour = 24;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("34.13");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test13CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the normal period
		// 	18 euro in total
		// 	reduction for -> 18 - 5.5 = 12.5
		//	reduction applied -> 45.5 * 0.75 = 9.375

		//given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 9;
		int endHour = 11;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("9.38");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test14CalculateStudent() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the reduced period
		// 	9 euro in total
		// 	reduction for -> 9 - 5.5 = 3.5
		//	reduction applied -> 3.5 * 0.75 = 2.625

		//given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 13;
		int endHour = 16;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("2.63");
		Assert.assertEquals(expectedCost, realCost);
	}

	//	Precondition: a rate object needs to be created to test the calculate() method
	public Rate rateObject_Staff()
	{
		CarParkKind parkKind = CarParkKind.STAFF;
		BigDecimal normalRate = new BigDecimal(9);
		BigDecimal reducedRate = new BigDecimal(3);
		ArrayList<Period> normalPeriods = new ArrayList<>();
		normalPeriods.add(new Period(8, 12));
		ArrayList<Period> reducedPeriods = new ArrayList<>();
		reducedPeriods.add(new Period(12,17));

		//	when
		return new Rate(parkKind, normalRate, reducedRate,reducedPeriods, normalPeriods);
	}

	@Test
	public void Test1CalculateStaff() throws IllegalArgumentException
	{
		// 	Partitioned Test -> startHour < endHour
		// 	9 euro total

		// 	given
		Rate rate = rateObject_Staff();
		int startHour = 11;
		int endHour = 12;

		// 	when
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		// 	then
		BigDecimal expectedCost = new BigDecimal("9.00");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test2CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == 0
		// 	51 euro in total

		// 	given
		Rate rate = rateObject_Staff();

		// 	when
		int startHour = 0;
		int endHour = 20;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		// 	then
		BigDecimal expectedCost = new BigDecimal("16.00");
		Assert.assertEquals(expectedCost, realCost);
	}


	@Test(expected = IllegalArgumentException.class)
	public void Test3CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 0

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 0;
		int endHour = 0;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test4CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour == endHour

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 17;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test5CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > endHour

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 19;
		int endHour = 17;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test6CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour < 0

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = -2;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test7CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour > 24

		//	given
		Rate rate = rateObject_Student();

		//	when
		int startHour = 25;
		int endHour = 13;
		Period car1 = new Period(startHour, endHour);

		//	then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test8CalculateStaff() throws IllegalArgumentException
	{
		// Partitioned Test -> endHour < 0

		// given
		Rate rate = rateObject_Staff();

		// when
		int startHour = 13;
		int endHour = -1;
		Period car1 = new Period(startHour, endHour);

		// then
		rate.calculate(car1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void Test9CalculateStaff() throws IllegalArgumentException
	{
		// Partitioned Test -> endHour > 24

		// given
		Rate rate = rateObject_Staff();

		// when
		int startHour = 13;
		int endHour = 26;
		Period car1 = new Period(startHour, endHour);

		// then
		rate.calculate(car1);
	}
	@Test
	public void Test10CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> endHour == 24
		// 	51 euro in total

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 3;
		int endHour = 24;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("16.00");
		Assert.assertEquals(expectedCost, realCost);
	}
	@Test
	public void Test11CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour && endHour outside paying periods
		// 	0 euro in total

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 19;
		int endHour = 21;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("0.00");
		Assert.assertEquals(expectedCost, realCost);
	}
	@Test
	public void Test12CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> startHour && endHour cover all day
		// 	51 euro in total

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 0;
		int endHour = 24;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("16.00");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test13CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the normal period
		// 	18 euro in total

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 9;
		int endHour = 11;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("16.00");
		Assert.assertEquals(expectedCost, realCost);
	}

	@Test
	public void Test14CalculateStaff() throws IllegalArgumentException
	{
		//	Partitioned Test -> paring only in the reduced period
		// 	9 euro in total

		//	given
		Rate rate = rateObject_Staff();

		//	when
		int startHour = 13;
		int endHour = 16;
		Period car1 = new Period(startHour, endHour);
		BigDecimal realCost = rate.calculate(car1);

		//	then
		BigDecimal expectedCost = new BigDecimal("9.00");
		Assert.assertEquals(expectedCost, realCost);
	}
}


