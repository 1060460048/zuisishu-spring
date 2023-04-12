package cn.zuisishu.springframework;

/**
 * 作者：GuruYu https://github.com/1060460048/zuisishu-spring
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
