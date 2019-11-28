package com.example.demo.Controller;

import com.example.demo.Repository.MUsersRepository;
import com.example.demo.service.MUsersService;
import com.example.demo.model.MUsersEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@EnableAutoConfiguration
public class dbController {
    @Autowired
    private MUsersService mUsersService;

    @RequestMapping(value = "/db")
    public String text1() {
        List<MUsersEntity> infoList = mUsersService.findAll();
        System.out.println(infoList.get(0).getMailAddress());

        MUsersEntity mUsers = new MUsersEntity();
        mUsers.setId(1);
        mUsers.setMailAddress("Koriyama");
        mUsers.setPassword("pass");
        mUsers.setName("tama");

        //mUsersService.save(mUsers);

        //mUsersService.delete(4);
        //Optional<MUsersEntity> fB = mUsersService.findBy(5);
        //MUsersEntity info = fB.get();

        return infoList.get(0).getMailAddress();
    }


}
