package com.sunny.design.mode.factory.spring;

import java.io.IOException;
import java.util.Properties;

/**
 * @author sunny
 * @className Main
 * @date 2018-03-02 16:04
 * @description:
 */
public class Main {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            // getResourceAsStream() 方法是从src目录读取文件
            properties.load(Main.class.getClassLoader().
                    getResourceAsStream("spring.properties"));

            String vehicleTypeName = properties.getProperty("VehicleType");

            // 使用class.forName转换为
            Object object = Class.forName(vehicleTypeName).newInstance();

            System.out.println("vehicleTypeName = " + vehicleTypeName);
            Moveable moveable = (Moveable) object;
            moveable.run();
            System.out.println("===========使用配置文件加载bean============");
            //使用配置文件加载bean
            BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
            moveable = (Moveable) beanFactory.getBean("car");
            moveable.run();

        } catch (IOException e) {
            System.out.println("读取文件异常：" + e);
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
