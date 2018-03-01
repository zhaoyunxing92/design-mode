package com.sunny.designMode.observer;

import java.util.Observable;

/**
 * @author sunny
 * @className ConcreteWeatherSubject
 * @date 2018-02-26 16:14
 * @description:
 */
public class ConcreteWeatherSubject extends Observable {

    /**
     * 天气情况的内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // 天气变化通知所有的观察者
        /**
         * 必须设置
         * @see Observable#notifyObservers(java.lang.Object) 方法 152行
         */
        this.setChanged();
      
      this.notifyObservers(content);
    }
}
