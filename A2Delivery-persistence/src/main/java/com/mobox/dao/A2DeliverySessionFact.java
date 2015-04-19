package com.mobox.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class A2DeliverySessionFact {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session openSession() {
        return sessionFactory.openSession();
    }

    public static void closeSesFact() {
        sessionFactory.close();
    }

}
