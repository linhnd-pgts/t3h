package com.group7.bookshopwebsite.repository;

import com.group7.bookshopwebsite.entity.Order;
import com.group7.bookshopwebsite.entity.OrderDetail;
import com.group7.bookshopwebsite.entity.composite_key.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
    List<OrderDetail> findByOrder(Order order);

    @Query("SELECT od.quantity FROM OrderDetail od WHERE od.order.id = :orderId AND od.book.id = :bookId")
    int findByBookAndOrOrder(Long orderId, Long bookId);
}
