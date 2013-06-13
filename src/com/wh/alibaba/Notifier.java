package com.wh.alibaba;

/**
 * Created with IntelliJ IDEA.
 * User: hijack
 * Date: 13-6-13
 * Time: 下午5:08
 * To change this template use File | Settings | File Templates.
 */
public interface Notifier {

    public void Notify();
    public void add(Observer observer);
    public void detach(Observer observer);
    public void setState(String state);
    public String getState();

}
