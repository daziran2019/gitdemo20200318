package com.atguigu.gitdemo20200318.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;

@Controller
@ResponseBody
@RequestMapping("/first")
public class Demo1Controller {
    @RequestMapping("/hello")
    public String test1(){
        System.out.println("xxx");

/* itar
  for (int i = 0; i < array.length; i++) {
             = array[i];

        }
  iter
        for (Object o : ) {

        }
  itco
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();

        }*/
        return "你好啊--123--hello";
    }
}
