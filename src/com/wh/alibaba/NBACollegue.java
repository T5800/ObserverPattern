package com.wh.alibaba;

/**
 * Created with IntelliJ IDEA.
 * User: hijack
 * Date: 13-6-13
 * Time: 下午4:49
 * To change this template use File | Settings | File Templates.
 */
public class NBACollegue implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NBACollegue(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        System.out.println(state + ", " + this.getName() + "退出NBA播放器，摆出工作的姿势!");
    }
}
