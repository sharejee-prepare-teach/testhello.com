package testhello.com.model;
import javax.persistence.*;
/**
 * Create By: Ron Rith
 * Create Date on: 3/28/2019.
 */
@Entity
@Table(name = "test_hello")
public class TestHello {
    private Long id;
    private String name;

    public TestHello(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public TestHello() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
