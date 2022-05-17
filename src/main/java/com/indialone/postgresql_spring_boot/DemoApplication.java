package com.indialone.postgresql_spring_boot;

import com.indialone.postgresql_spring_boot.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private StudentDao studentDao;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//		System.out.println("table created -> " + studentDao.createTable());
//		System.out.println("table created -> " + studentDao.insertData("fake","fakecity"));
//		System.out.println("table created -> " + studentDao.updateData(3,"Natavar","Ahmedabad"));
        System.out.println("table created -> " + studentDao.deleteData(5));
    }
}
