package gabrielfukao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gabrielfukao.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}