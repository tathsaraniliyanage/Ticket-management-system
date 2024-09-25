package lk.ijse.gdse.ticketManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TicketDTO {
    private String price;
    private String count;
}
