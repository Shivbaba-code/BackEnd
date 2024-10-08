//package com.example.demo;
//
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jndi.JndiTemplate;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import jakarta.persistence.EntityManagerFactory;
//
//@Configuration
//@EnableTransactionManagement
//@PropertySource("classpath:persistence-jndi.properties")
//@ComponentScan("com.baeldung.hibernate.cache")
//@EnableJpaRepositories(basePackages = "com.baeldung.hibernate.cache.dao")
//public class PersistenceJNDIConfig {
//
//    @Autowired
//    private Environment env;
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() 
//      throws NamingException {
//        LocalContainerEntityManagerFactoryBean em 
//          = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource());
//        
//        // rest of entity manager configuration
//        return em;
//    }
//
//    @Bean
//    public DataSource dataSource() throws NamingException {
//        return (DataSource) new JndiTemplate().lookup(env.getProperty("jdbc.url"));
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(emf);
//        return transactionManager;
//    }
//
//    // rest of persistence configuration
//}