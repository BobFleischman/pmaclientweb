package com.automateddocsys.pma.pmaclientdata.config;

import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.automateddocsys.pma.pmaclientdata.model.Clientname;


@Configuration
@EnableJpaRepositories(value={"com.automateddocsys.pma.pmaclientdata.repository"})
@ComponentScan(basePackages={"com.automateddocsys.pma.pmaclientdata"})
public class DataConfiguration {

    @Bean
    public DataSource dataSource() {
        //EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        DriverManagerDataSource ds = new org.springframework.jdbc.datasource.DriverManagerDataSource();
        ds.setUsername("security");
        ds.setPassword("springsecurity");
        //ds.setUrl("jdbc:mysql://phlmysql01/spring_security?rewriteBatchedStatements=true");
        ds.setUrl("jdbc:mysql://localhost/pmaweb2?rewriteBatchedStatements=true");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setGenerateDdl(false);
        vendorAdapter.setShowSql(true);
//        Map<String, Object> m = vendorAdapter.getJpaPropertyMap();
//        m.put("hibernate.format_sql", true);
//        for (String key : m.keySet()) {
//        	System.out.println(key);
//        }

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan(Clientname.class.getPackage().getName());
        factory.setDataSource(dataSource());
        Properties props = new Properties();
        props.put("hibernate.show_sql", true );
        props.put("show_sql", true );
        props.put("hibernate.format_sql", true);
        props.put("format_sql", true);
        props.put("hibernate.use_sql_comments", true);
        props.put("use_sql_comments", true);
        factory.setJpaProperties(props);        
        Map<String, Object> m = factory.getJpaPropertyMap();
        for (String key : m.keySet()) {
        	System.out.println(key);
        }
        factory.afterPropertiesSet();
        return factory;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return txManager;
    }
}
