package ai.ecma.apppaymesavingaccount.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Client client;

    @Column(nullable = false)
    private Integer orderSum;

    public Order(Client client, Integer orderSum) {
        this.client = client;
        this.orderSum = orderSum;
    }
}
