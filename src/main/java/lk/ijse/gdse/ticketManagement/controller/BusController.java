package lk.ijse.gdse.ticketManagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ijse.gdse.ticketManagement.service.BusService;
import lombok.AllArgsConstructor;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */
@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class BusController {
    final private BusService busService;
    
    

}
