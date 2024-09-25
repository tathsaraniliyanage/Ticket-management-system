package lk.ijse.gdse.ticketManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */

@Entity
@Table(name = "Bus")
public class Bus {
    @Id
    private String regId;
    private String name;
    private String category;
}
