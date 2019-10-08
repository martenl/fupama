package de.martenl.fupama.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping("/{id}")
    public Map<String, Object> getCar(@PathVariable final Long id) {

        return Map.of("name", "Mercedes");
    }

    @GetMapping
    public List<Map<String, Object>> getCars(@RequestParam(defaultValue = "0") final Integer page) {

        return List.of(Map.of("name", "Mercedes"));
    }

    public List<Map<String, Object>> getCarsForLocation(final double lat, final double lon) {

        return List.of(Map.of("name", "Mercedes"));
    }
}
