package com.sunny.design.mode.factory.springFactory;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sunny
 * @className ClassPathXmlApplicationContext
 * @date 2018-03-05 10:54
 * @description:
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

    public Map<String, Object> container = new HashMap<>();

    public ClassPathXmlApplicationContext(String fileName) {

        try {
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(this.getClass().getClassLoader().getResourceAsStream(fileName));
            Element root = document.getRootElement();
            // 获取全部bean
            List<Element> list = XPath.selectNodes(root, "/beans/bean");
           // System.out.println(list.size());

            for (int i = 0; i < list.size(); i++) {
                Element bean = list.get(i);
                String id = bean.getAttributeValue("id");
                String clazz = bean.getAttributeValue("class");
                //System.out.println(id + " > " + clazz);
                Object object = Class.forName(clazz).newInstance();
                container.put(id, object);
            }

        } catch (JDOMException | IOException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object getBean(String id) {
        return container.get(id);
    }
}
