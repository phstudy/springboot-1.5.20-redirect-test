package org.studyonsoftware.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @GetMapping(value = {"/page"})
    public ModelAndView page() {
        return new ModelAndView("test");
    }
}