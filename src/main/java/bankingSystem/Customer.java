package bankingSystem;

import java.util.Objects;
import java.util.UUID;

public class Customer {

    private final UUID id;

    public Customer() {
        id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
