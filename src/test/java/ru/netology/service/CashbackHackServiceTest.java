package ru.netology.service;



import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {
    @org.testng.annotations.Test
    void cashbackServiceMaxAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    void cashbackservice() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void cashbackServiceAboutMaxAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    void cashbackMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);

    }
}

