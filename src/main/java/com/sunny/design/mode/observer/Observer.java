package com.sunny.design.mode.observer;

/**
 * @author sunny
 * @className Observer
 * @date 2018-02-26 14:27
 * @description: 观察者接口，定义一个更新的接口在目标发生改变的时候通知其他对象
 */
public interface Observer {
    /**
     * 更新的接口
     *
     * @param subject 传入的目标对象，方便获取相应的目标对象状态
     */
  void update(Subject subject);
}
