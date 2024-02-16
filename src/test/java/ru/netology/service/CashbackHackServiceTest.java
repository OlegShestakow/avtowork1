package ru.netology.service;


public class CashbackHackServiceTest {
    @org.junit.Test
   public void cashbackServiceMaxAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(actual, expected);

    }
    @org.junit.Test
    public void cashbackservice() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
   public void cashbackServiceAboutMaxAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(actual, expected);

    }
    @org.junit.Test
   public void cashbackMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(actual, expected);

    }
}

