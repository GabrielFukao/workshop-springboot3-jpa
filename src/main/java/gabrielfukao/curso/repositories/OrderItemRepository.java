package gabrielfukao.curso.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import gabrielfukao.curso.entities.OrderItem;
import gabrielfukao.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}