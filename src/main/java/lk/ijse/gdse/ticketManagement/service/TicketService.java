package lk.ijse.gdse.ticketManagement.service;

import lk.ijse.gdse.ticketManagement.repository.TicketRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */

@Service
@AllArgsConstructor
public class TicketService {
    final private TicketRepo ticketRepo;

}
