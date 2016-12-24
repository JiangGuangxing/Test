package org.jgx;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

/**
 * Created by JiangGuagnxing on 2016/12/21.
 */
public class Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Test t = new Test();
        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(t);
        bw.setPropertyValue("name","ttt");
        System.out.println(t.getName());
    }
}
