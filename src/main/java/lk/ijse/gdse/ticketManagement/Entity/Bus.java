package lk.ijse.gdse.ticketManagement.Entity;

import jakarta.persistence.*;

/**
 * @author Praboda Thathsarani
 * @Project ticketManagement
 */

@Entity
@Table(name = "Bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String regId;
    private String name;
    private String category;
}
