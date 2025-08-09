package choujiang;

public class LotterySystem {
    private LotteryStrategy lotteryStrategy;

    public LotterySystem(LotteryStrategy lotteryStrategy) {
        this.lotteryStrategy = lotteryStrategy;
    }

    public void startDraw(String user) {
        System.out.println(user + " 抽到了：" + lotteryStrategy.drawPrize());
    }

    // 支持动态切换策略
    public void setStrategy(LotteryStrategy strategy) {
        this.lotteryStrategy = strategy;
    }
}
