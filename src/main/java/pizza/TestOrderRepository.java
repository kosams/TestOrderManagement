package pizza;

import org.springframework.data.jpa.repository.JpaRepository;
;

public interface TestOrderRepository extends JpaRepository<TestOrder, Long> {

}