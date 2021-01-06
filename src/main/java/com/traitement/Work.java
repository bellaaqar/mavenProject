package com.traitement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Work {
    public void traitement() throws PropertyVetoException, IOException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        InputStream input = getClass().getClassLoader().getResourceAsStream("conf.properties");
        Properties prop = new Properties();
        prop.load(input);
        dataSource.setUser(prop.getProperty("db.user"));
        dataSource.setPassword(prop.getProperty("db.password"));
        dataSource.setJdbcUrl(prop.getProperty("db.jdbUrl"));
        dataSource.setDriverClass(prop.getProperty("db.classDriver"));

        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        List<Map<String,Object>> list = jdbc.queryForList("select * from clients");
        System.out.println("list Size"+ list.size());
    }

}
