package com;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.traitement.Work;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args ) throws PropertyVetoException, IOException {

        Work work = new Work();
        work.traitement();



    }
}
