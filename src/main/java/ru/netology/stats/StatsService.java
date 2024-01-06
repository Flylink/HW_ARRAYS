package ru.netology.stats;

import java.util.ArrayList;
import java.util.List;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sumAllSales = 0; // сумма всех продаж
        for (long sale : sales) {
            sumAllSales += sale; // прибавляем к предыдущему значению
        }
        return sumAllSales; // возвращаем все сложенные суммы
    }

    public long averageSalesMonth(long[] sales) {
        return sumAllSales(sales) / sales.length; // сумму всех продаж делим на массив
    }

    public List<Integer> minSales(long[] sales) {
        List<Integer> allMinMonth = new ArrayList<>(); // список для хранения индексов элементов с максимальным значением
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                minMonth = i; // запомним его как максимальный
                allMinMonth.clear(); // очищаем список, если нашли новое максимальное значение
            }
            if (sales[i] == sales[minMonth]) {
                allMinMonth.add(i + 1); // добавляем индекс элемента с максимальным значением в список и сдвигаем на 1 так как индекс массива начинается с 0 а месяц нумеруется с 1
            }
        }

        return allMinMonth; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public List<Integer> maxSales(long[] sales) {
        List<Integer> allMaxMonth = new ArrayList<>(); // список для хранения индексов элементов с максимальным значением
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
                allMaxMonth.clear(); // очищаем список, если нашли новое максимальное значение
            }
            if (sales[i] == sales[maxMonth]) {
                allMaxMonth.add(i + 1); // добавляем индекс элемента с максимальным значением в список и сдвигаем на 1 так как индекс массива начинается с 0 а месяц нумеруется с 1
            }
        }

        return allMaxMonth; // возвращаем список с элементами
    }

    public int findMonthsBelowAverage(long[] sales) {
        long average = averageSalesMonth(sales); // принимает массив `sales` и возвращает количество месяцев, в которых продажи были ниже среднего
        int countMonthsBelow = 0;
        for (long sale : sales) { //затем проходим по массиву и считаем количество месяцев, в которых продажи были меньше среднего.
            if (sale < average) {
                countMonthsBelow++; // ведем счёт месяцев
            }
        }
        return countMonthsBelow; // возвращаем посчитанное количество месяцев
    }

    public int findMonthsAboveAverage(long[] sales) {
        long average = averageSalesMonth(sales); // принимает массив `sales` и возвращает количество месяцев, в которых продажи были ниже среднего
        int countMonthsAbove = 0;
        for (long sale : sales) { ////затем проходим по массиву и считаем количество месяцев, в которых продажи были больше среднего.
            if (sale > average) {
                countMonthsAbove++; // ведем счёт месяцев
            }
        }
        return countMonthsAbove; // возвращаем посчитанное количество месяцев
    }
}

