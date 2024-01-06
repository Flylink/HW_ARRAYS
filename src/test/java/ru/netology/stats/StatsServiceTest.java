package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StatsServiceTest {

    @Test
    public void calculateAmountAllSales() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;
        long actualAmount = service.sumAllSales(temps);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void calculateAverageAmountSalesMonth() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 15;
        long actualAmount = service.averageSalesMonth(temps);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMinimumSale() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        List<Integer> expectedMonths = Arrays.asList(9);
        List<Integer> actualMonths = service.minSales(temps);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFindMaximumSale() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        List<Integer> expectedMonths = Arrays.asList(6, 8);
        List<Integer> actualMonths = service.maxSales(temps);

        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFindMonthsBelowAverage() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 5;
        long actualAmount = service.findMonthsBelowAverage(temps);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMonthsAboveAverage() {
        StatsService service = new StatsService();

        long[] temps = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 5;
        long actualAmount = service.findMonthsAboveAverage(temps);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

}

