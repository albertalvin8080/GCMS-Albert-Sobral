package br.edu.ifpe.recife.gcms.WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public @ResponseBody String greeting()
    {
        return "Hello, World";
    }

    @RequestMapping("/albert")
    public @ResponseBody String greetingAlbert()
    {
        return "Hello, Albert!";
    }

    @RequestMapping("/main")
    public @ResponseBody String greetingMain()
    {
        return "Hello, Main!";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody String greetingHotfix()
    {
        return "Hello, Hotfix!";
    }
}
