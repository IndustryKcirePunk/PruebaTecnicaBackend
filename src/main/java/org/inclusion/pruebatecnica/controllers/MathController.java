package org.inclusion.pruebatecnica.controllers;

import jakarta.validation.Valid;
import org.inclusion.pruebatecnica.dtos.CalculateMaximumDto;
import org.inclusion.pruebatecnica.services.MathServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {
    private final MathServices service;

    public MathController(MathServices service) {
        this.service = service;
    }


    @GetMapping("/{x}/{y}/{z}")
    public int math(
            @PathVariable int x,
            @PathVariable int y,
            @PathVariable int z
    ) {
        return service.findMaximumNumber(x, y, z);
    }

    @PostMapping
    public int math(@Valid @RequestBody CalculateMaximumDto dto) {
        return service.findMaximumNumber(dto.x, dto.y, dto.z);
    }

}
