package com.paas.cicd.controller;

/*
 * Created by fengdaochen on 23/11/2017
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomePageController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getPage() {
        int i = 0;

        try {
            int j = 1 / i;
            System.out.println("j=" + j);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }

        return "index";
    }
}