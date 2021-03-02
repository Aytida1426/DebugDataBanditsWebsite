package com.debugdatabandits.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebsiteController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String Index() {
        return "Index";
    }
    @GetMapping("/journals")
    public String Journals() { return "Journals"; }
    
}