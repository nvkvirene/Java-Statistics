package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] month) {
        int sum = 0;
        for (int i = 0; i < month.length; i++) {
            sum += month[i];
        }
        return sum;
    }

    public long midSumSales(long[] sales) {
        long midSum = sumSales(sales);
        return midSum / 12;
    }

    public long peakSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumMonthMinSales(long[] sales) {
        int sumMonth = 0;

        for (long sale : sales) {
            if (sale > midSumSales(sales)) {
                sumMonth++;
            }
        }
        return sumMonth;
    }

    public int sumMonthMaxSales(long[] sales) {
        int sumMonth = 0;

        for (long sale : sales) {
            if (sale < midSumSales(sales)) {
                sumMonth++;
            }
        }
        return sumMonth;
    }
}
