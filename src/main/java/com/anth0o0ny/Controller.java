package com.anth0o0ny;

import com.anth0o0ny.model.Points;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    private final InterpolationService interpolationService;


    @Autowired
    public Controller(InterpolationService interpolationService) {
        this.interpolationService = interpolationService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("interpolation/solve")
    @ResponseBody
    public ObjectNode solve(@RequestBody Points points) {
        return interpolationService.solve(points);
    }

}
