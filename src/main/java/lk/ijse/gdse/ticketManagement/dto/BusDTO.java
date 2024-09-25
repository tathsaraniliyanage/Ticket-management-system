package lk.ijse.gdse.ticketManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BusDTO {
    @Id
    private String regId;
    private String name;
    private String category;
}
