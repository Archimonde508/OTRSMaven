package org.example.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obliczenia")
public class ObliczenieController {

    @GetMapping("/power")
    public String power(@RequestParam(value = "base") String b,
                        @RequestParam(value="exponent") String p) {

        var result = Math.pow(Double.parseDouble(b), Double.parseDouble(p));
        return "Result: " + result;
    }
}