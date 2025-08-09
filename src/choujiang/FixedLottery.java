package choujiang;

public class FixedLottery implements LotteryStrategy{
    @Override
    public String drawPrize() {
        return "恭喜获得满10000000-5优惠券";
    }
}
