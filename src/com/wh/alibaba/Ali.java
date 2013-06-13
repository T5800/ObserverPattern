package com.wh.alibaba;

/**
 * Created with IntelliJ IDEA.
 * User: hijack
 * Date: 13-6-13
 * Time: 下午4:52
 * To change this template use File | Settings | File Templates.
 */
public class Ali {
    public static void main(String[] args) {
        Notifier boss = new Boss();

        Observer nba = new NBACollegue("看NBA的人");
        Observer bond = new BondCollegue("看股票的人");
        boss.add(nba);
        boss.add(bond);

        boss.setState("我回来啦!");
        boss.Notify();

        Notifier secretary = new Secretary();

        secretary.add(nba);
        secretary.add(bond);

        secretary.setState("老板回来了，快准备!");
        secretary.Notify();

        boss.detach(nba);
        boss.Notify();

        secretary.detach(nba);
        secretary.Notify();


    }
}
