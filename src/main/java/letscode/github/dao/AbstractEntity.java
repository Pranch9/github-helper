package letscode.github.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

public class AbstractEntity implements Serializable {

    @Id
    @Column(length = 36)
    private UUID id;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
