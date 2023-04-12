package cn.zuisishu.springframework;

import java.util.Map;
import java.util.HashMap;

/**
 * 作者：guruYu https://github.com/1060460048/zuisishu-spring
 */
public class MyBeanContainer {

    private Map<String, BeanDefinition> beans = new HashMap<>();

    public Object getBean(String name) {
        return beans.get(name).getBean();
    }

    public void register(String name, BeanDefinition bean) {
        beans.put(name, bean);
    }

}
