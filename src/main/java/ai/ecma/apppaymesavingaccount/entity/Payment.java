package ai.ecma.apppaymesavingaccount.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Client client;

    //USHBU TO'LOVDAN QANCHA TISHGANI
    @Column(nullable = false)
    private Double paySum;

    //USHBU TO'LOVDAN QANCHA QOLGANI
    @Column(nullable = false)
    private Double leftoverSum;

    private Timestamp payDate = new Timestamp(System.currentTimeMillis());

    private Long orderTransactionId;

    private String transactionId;

    private Boolean cancelled = false;

    public Payment(Client client, Double paySum, Double leftoverSum, Timestamp payDate, Long orderTransactionId, String transactionId) {
        this.client = client;
        this.paySum = paySum;
        this.leftoverSum = leftoverSum;
        this.payDate = payDate;
        this.orderTransactionId = orderTransactionId;
        this.transactionId = transactionId;
    }
}
