package lk.ijse.gdse.ticketManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ijse.gdse.ticketManagement.service.BusService;
import lombok.AllArgsConstructor;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */
@RestController
@RequestMapping("/api/v1/Bus")
@AllArgsConstructor
public class BusController {
    final private BusService busService;

    @GetMapping("/health")
    public String healthCheck(){
        System.out.println("abcd");
        return "hello world";
    }


}
