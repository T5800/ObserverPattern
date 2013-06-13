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

        boss.add(new NBACollegue("看NBA的人"));
        boss.add(new BondCollegue("看股票的人"));

        boss.setState("我回来啦!");
        boss.Notify();

        Notifier secretary = new Secretary();

        secretary.add(new NBACollegue("看NBA的人"));
        secretary.add(new BondCollegue("看股票的人"));

        secretary.setState("老板回来了，快准备!");
        secretary.Notify();


    }
}
