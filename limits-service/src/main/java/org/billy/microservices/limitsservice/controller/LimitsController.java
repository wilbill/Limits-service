package org.billy.microservices.limitsservice.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.billy.microservices.limitsservice.configuration.Configuration;
import org.billy.microservices.limitsservice.domain.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {
    private final Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
