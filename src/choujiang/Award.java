package choujiang;

public class Award {
    public static void main(String[] args) {
        LotterySystem system = new LotterySystem(new LotteryImpl());
        system.startDraw("用户A");

        system.setStrategy(new FixedLottery());
        system.startDraw("用户B");

    }
}
