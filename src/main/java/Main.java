import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long sum = service.sumSales(arr);
        System.out.println(Arrays.toString(new String[]{"Сумма всех продаж равна " + sum}));

        long midSum = service.midSumSales(arr);
        System.out.println(Arrays.toString(new String[]{"Средняя сумма всех продаж в месяц " + midSum}));

        long maxMonth = service.peakSales(arr);
        System.out.println(Arrays.toString(new String[]{maxMonth + " - месяц, в котором продажи осуществленны на максимальную сумму"}));

        long minMonth = service.minSales(arr);
        System.out.println(Arrays.toString(new String[]{minMonth + " - месяц, в котором продажи осуществленны на минимальную сумму"}));

        long calcMinMonthSales = service.sumMonthMinSales(arr);
        System.out.println(Arrays.toString(new String[]{calcMinMonthSales + " - Кол-во месяцев, в которых продажи были ниже среднего"}));

        long calcMaxMonthSales = service.sumMonthMaxSales(arr);
        System.out.println(Arrays.toString(new String[]{calcMaxMonthSales + " - Кол-во месяцев, в которых продажи были выше среднего"}));
    }
}
