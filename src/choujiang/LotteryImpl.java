package choujiang;

import java.util.Random;

public class LotteryImpl implements LotteryStrategy{
    private String[] prices = {"苹果耳机","小米手机", "华为平板", "小米电视", "iPhone手机"};
    private Random random = new Random();

    @Override
    public String drawPrize() {
        return prices[random.nextInt(prices.length)];
    }
}

