package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfIncome() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 13, 10};

        long expected = 13;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfValuesAreEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}