package org.somethings.test;

//import org.junit.jupiter.api.Assertions;
import org.somethings.service.CashbackHackService;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {
    @Test
    void ShouldCalculateIfZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0; //вводное

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

    @Test
    void ShouldCalculateIf900() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900; //вводное

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    void ShouldCalculateIf1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1100; //вводное

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);

    }

    @Test
    void ShouldCalculateIfThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000; //вводное

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}
