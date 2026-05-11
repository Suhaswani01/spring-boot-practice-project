package com.example.MiniProject01.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.MiniProject01.bean.Service.Vechical;

@Component
public class runner implements CommandLineRunner {

    @Autowired
    @Qualifier("bike")
    public Vechical v1;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Project 2 Output ===");
        v1.drive();  // ✅ bas itna likhna hai!
        System.out.println("========================");
    }
}