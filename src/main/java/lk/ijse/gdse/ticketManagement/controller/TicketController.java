package lk.ijse.gdse.ticketManagement.controller;

import lk.ijse.gdse.ticketManagement.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */

@RestController
@RequestMapping("/api/v1/ticket")
@AllArgsConstructor
public class TicketController {
    final private TicketService ticketService;
}
