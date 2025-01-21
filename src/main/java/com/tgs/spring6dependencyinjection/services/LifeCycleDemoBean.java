package com.tgs.spring6dependencyinjection.services;

import com.tgs.spring6dependencyinjection.controllers.greeting.MyController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Bean Aware Interface
 *  ApplicationContextAware - Interface to be implemented by any object that wishes to be notified of the ApplicationContext that it runs in.
 *  ApplicationEventPublisherAware - Set the ApplicationEventPublisher that this object runs in.
 *  BeanClassLoaderAware - Callback that supplies the bean class loader to a bean instance.
 *  BeanFactoryAware - Callback that supplies the owning factory to a bean instance.
 *  BeanNameAware - Set the name of the bean in the bean factory that created this bean.
 *  BootstrapContextAware - Set the BootstrapContext that this object runs in.
 *  LoadTimeWeaverAware - Set the LoadTimeWeaver of this object’s containing ApplicationContext.
 *  MessageSourceAware - Set the MessageSource that this object runs in.
 *  NotificationPublisherAware - Set the NotificationPublisher instance for the current managed resource instance.
 *  PortletConfigAware - Set the PortletConfig this object runs in.
 *  PortletContextAware - Set the PortletContext that this object runs in.
 *  ResourceLoaderAware - Set the ResourceLoader that this object runs in.
 *  ServletConfigAware - Set the ServletConfig that this object runs in.
 *  ServletContextAware - Set the ServletContext that this object runs in
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

    public LifeCycleDemoBean(){
        System.out.println("I am in the LifeCycleBean Constructor");
    }

    private String javaVersion;

    @Value("${java.specification.version}")
    public void setJavaVersion(String javaVersion){
        this.javaVersion = javaVersion;
        System.out.println("1. Properties Set. Java Version :"+this.javaVersion);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2. BeanNameAware My Bean Name is "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3. BeanFactoryAware - Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("4. ApplicationContextAware - Application content has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("5. PostConstruct that post construct annotation method has been called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6. AftrPropertiesSet populate properties the LifeCycleBean has its property");
    }

    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println("7. the @PreDestroy annotation method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("8. The DisposableBean.destroy(), The lifecycle bean has been terminated");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Post process Before Initialization " + beanName);

        if(bean instanceof MyController){
            System.out.println("Calling before initialization");
            ((MyController) bean).beforeInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("9. Post process After Initialization " + beanName);
        if(bean instanceof MyController){
            MyController myController = (MyController) bean;
            System.out.println("Calling after initialization");
            myController.afterInit();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
