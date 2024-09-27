package lk.ijse.gdse.ticketManagement.service;

import lk.ijse.gdse.ticketManagement.dto.BusDTO;
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

    public void saveBus(BusDTO busDTO) {
    }

    public void updateBus(BusDTO busDTO) {

    }
    public BusDTO getBus(String id){
       return  new BusDTO();
    }
}
