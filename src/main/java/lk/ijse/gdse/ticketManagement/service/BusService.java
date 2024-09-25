package lk.ijse.gdse.ticketManagement.service;

import lk.ijse.gdse.ticketManagement.repository.BusRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */
@Service
@AllArgsConstructor
public class BusService {
    final private BusRepo busRepo;
}
