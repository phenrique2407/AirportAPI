/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.phenrique.airports.controllers;

import br.dev.phenrique.airports.entities.Airport;
import br.dev.phenrique.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */
@RestController
public class AirportController {
    @Autowired
    private AirportService airportService;
    
    /**
     * Endpoint /airport/airport
     * Retorna TODOS os aeroportos da base de dados.
     * @return
     */
    @GetMapping("/airport")
    public List<Airport> findAll(){
        List<Airport> result = airportService.findAll();
        return result;
    }
}
