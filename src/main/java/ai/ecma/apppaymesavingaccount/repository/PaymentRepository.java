package ai.ecma.apppaymesavingaccount.repository;

import ai.ecma.apppaymesavingaccount.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Optional<Payment> findFirstByOrderTransactionIdOrderByPayDateDesc(Long orderTransactionId);


}
