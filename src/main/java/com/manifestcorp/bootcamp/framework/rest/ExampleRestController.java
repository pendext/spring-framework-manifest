package com.manifestcorp.bootcamp.framework.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleRestController {

    @GetMapping
    public ExampleBody getExample(@RequestParam("name") String name) {
        return new ExampleBody(name);
    }

    @PostMapping
    public ExampleBody postExample(@RequestBody ExampleRequest exampleRequest) {
        return new ExampleBody(exampleRequest.getInput());
    }

}
