package com.pankx.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.Mapping;
import sun.tools.java.ClassPath;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")//在全局配置文件中获取值
@PropertySource(value = {"classpath:person.properties"})//获取指定的配置文件中的值
//@Validated
public class Person {

    private String name;
    private Integer age;
    private Date birthday;
    private Map<String,Object> map;
    private List<Object> list;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", student=" + student +
                '}';
    }
}
