package com.indialone.postgresql_spring_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createTable() {
        String createTableQuery = "CREATE TABLE student(id SERIAL PRIMARY KEY, name VARCHAR(255) NOT NULL, city VARCHAR(255))";
        return jdbcTemplate.update(createTableQuery);
    }

    public int insertData(String name, String city) {
        String insertQuery = "INSERT INTO student(name,city) VALUES(?,?)";
        return jdbcTemplate.update(insertQuery, name, city);
    }

    public int updateData(int id, String name, String city) {
        String updateQuery = "UPDATE student SET name=?,city=? WHERE id=?";
        return jdbcTemplate.update(updateQuery, name, city, id);
    }

    public int deleteData(int id) {
        String deleteQuery = "DELETE FROM student WHERE id=?";
        return jdbcTemplate.update(deleteQuery, id);
    }

}
