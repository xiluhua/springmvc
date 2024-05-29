package com.springmvc.ctrl;

import com.springmvc.pojo.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Vue23DemoController {

    private static int count1 = 0;
    private static int count2 = 0;

    @RequestMapping("/request/person/getPersonName")
    public Result getPersonName() {
        String[] names = new String[]{"Jackie","Tomas","Laura","Poy","Lavie","Dove"};
        int i = generateRandomNumber(0,5);
        String name = names[i];
        return Result.success(name);
    }

    public int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    @RequestMapping("/students")
    public Result students() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("001", "Tom", 16));
        list.add(new Student("002", "Jerry", 17));
        list.add(new Student("003", "Rose", 18));
        System.out.println("count1: "+count1++);

        return Result.success(list);
    }

    @RequestMapping("/cars")
    public Result cars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("001", "Toyota", 160000));
        list.add(new Car("002", "Honda", 170000));
        list.add(new Car("003", "Tesla", 180000));
        System.out.println("count2: "+count2++);
        return Result.success(list);
    }
}

@Data
@AllArgsConstructor
class Student{
    private String id;
    private String name;
    private Integer age;
}

@Data
@AllArgsConstructor
class Car{
    private String id;
    private String brand;
    private Integer price;
}
