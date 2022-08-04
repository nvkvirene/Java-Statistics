package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calcSumSales() {
        StatsService service = new StatsService();

        long[] month = {15, 1, 12, 16, 0, 30, 2, 8, 19, 10, 12, 9};

        long expectedSum = 134;
        long actualSum = service.sumSales(month);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calcMidSumSales() {
        StatsService service = new StatsService();

        long[] month = {15, 1, 12, 16, 0, 30, 2, 8, 19, 10, 12, 9};

        long expectedMidSum = 11;
        long actualMidSum = service.midSumSales(month);

        Assertions.assertEquals(expectedMidSum, actualMidSum);
    }

    @Test
    public void calcPeakSales() {
        StatsService service = new StatsService();

        long[] month = {15, 1, 12, 16, 0, 30, 2, 8, 19, 10, 12, 9};

        long expectedPeakMonth = 6;
        long actualPeakMonth = service.peakSales(month);

        Assertions.assertEquals(expectedPeakMonth, actualPeakMonth);
    }

    @Test
    public void calcMinSales() {
        StatsService service = new StatsService();

        long[] month = {15, 1, 12, 16, 0, 30, 2, 8, 19, 10, 12, 9};

        long expectedMinMonth = 5;
        long actualMinMonth = service.minSales(month);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void calcMonthMinSales() {
        StatsService service = new StatsService();

        long[] month = {15, 1, 12, 16, 0, 30, 2, 8, 19, 10, 12, 9};

        long expectedMinMonth = 6;
        long actualMinMonth = service.sumMonthMinSales(month);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void calcMonthMaxSales() {
        StatsService service = new StatsService();

        long[] month = {10, 11, 12, 9, 5, 22, 30, 4, 6, 0, 55, 7};

        long expectedMaxMonth = 9;
        long actualMaxMonth = service.sumMonthMaxSales(month);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }
}

