package ai.ecma.apppaymesavingaccount.repository;

import ai.ecma.apppaymesavingaccount.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
