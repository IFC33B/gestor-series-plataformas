package ifc33b.dwesc.gestor_series_plataformes.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class GestorController {

    @GetMapping("/plataformes") // Devuelve las plataformas
    public int getPlataformes() {
        return 0;
    }

    @GetMapping("/series/plataforma/{id}") // Devuelve las series de una plataforma
    public int getSeries(@PathVariable Long id) {
        return 0;
    }

    @PostMapping("/series") // Crea una nueva serie
    public int postMethodName(@Valid @RequestBody String entity) {
        return 0;
    }

}