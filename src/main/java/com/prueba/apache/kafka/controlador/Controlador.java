package com.prueba.apache.kafka.controlador;

import com.prueba.apache.kafka.helper.ProductorKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ProgramacionColombia
 */
@RestController
@RequestMapping("Controlador")
public class Controlador {

    @Autowired
    private ProductorKafka productorKafka;

    @GetMapping("/{mensaje}")
    public String enviarMensaje(@PathVariable String mensaje) {
        String respuesta = "Proceso exitoso";
        try {
            productorKafka.send(mensaje);
        } catch (Exception e) {
            respuesta = "Error desconocido";
        }
        return respuesta;

    }

}
