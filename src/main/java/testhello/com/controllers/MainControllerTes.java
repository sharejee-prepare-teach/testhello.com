package testhello.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rith on 3/18/2019.
 */
@Controller
public class MainControllerTes {
    @RequestMapping(value = {"/", "/home"},method = RequestMethod.GET)
    public String goHome() {
        return "home";
    }
}
