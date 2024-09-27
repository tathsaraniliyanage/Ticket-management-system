package lk.ijse.gdse.ticketManagement.controller;

import lk.ijse.gdse.ticketManagement.dto.BusDTO;
import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    public String healthCheck() {
        System.out.println("abcd");
        return "hello world";
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveBus(@RequestBody BusDTO busDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bindingResult.getFieldErrors().get(0).getDefaultMessage());
        }

        try {
            busService.saveBus(busDTO);
            return ResponseEntity.status(HttpStatus.OK).body("bus saved successully !");
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("internal server error" + exception);
        }
    }


    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateBus(@RequestBody BusDTO busDTO, BindingResult bindingResult) {
        try {
            busService.updateBus(busDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Bus updated successfully !");
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("bus not updated" + exception);
        }

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteBus(@RequestBody BusDTO busDTO, BindingResult bindingResult) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body("bus deleted successfully");
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("bus not deleted" + exception);

        }

    }
}












