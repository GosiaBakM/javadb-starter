package pl.sda.library.orders;

import java.time.LocalDateTime;
import java.util.List;

public class JdbcOrdersDao implements IOrdersDao {

    @Override
    public void addOrder(int userId, int bookId, LocalDateTime dateTime) {
    }

    public List<Order> findOrders(OrderParameters orderParameters) {
        return null;
    }

    @Override
    public void updateReturnDate(int id, LocalDateTime returnDate) {
    }
}