package com.mediascorefinal.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mediascorefinal.app.Entity.Partido;
import com.mediascorefinal.app.exception.NotFoundException;
import com.mediascorefinal.app.repository.EquipoRepository;
import com.mediascorefinal.app.repository.PartidoRepository;

@Controller
@RequestMapping("/partidos")
public class PartidosTemplatesController {
    @Autowired
    private PartidoRepository partidoRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    @GetMapping("/")
    public String partidosListTemplate(Model model) {
        model.addAttribute("partidos", partidoRepository.findAll());
        return "partidos-list";
    }
    @GetMapping("/new")
    public String partidosNewTemplate(Model model) {
        model.addAttribute("partido", new Partido());
        model.addAttribute("equipos", equipoRepository.findAll());
        return "partidos-form";
    }
    @GetMapping("/edit/{id}")
    public String partidosEditTemplate(Model model, @PathVariable("id") String id) {
        Partido partido = partidoRepository.findById(id).orElseThrow(() -> new NotFoundException("Partido no encontrado"));
        model.addAttribute("partido", partido);
        model.addAttribute("equipos", equipoRepository.findAll());
        return "partidos-form";
    }
    @PostMapping("/save")
    public String partidosSaveProcess(@ModelAttribute("partido") Partido partido) {
        if (partido.getId().isEmpty()) {
            partido.setId(null);
        }
        partidoRepository.save(partido);
        return "redirect:/partidos/";
    }
    @GetMapping("/delete/{id}")
    public String partidosDeleteProcess(@PathVariable("id") String id) {
        partidoRepository.deleteById(id);
        return "redirect:/partidos/";
    }
}
