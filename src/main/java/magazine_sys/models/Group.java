package magazine_sys.models;
import jakarta.persistence.*;
import magazine_sys.enums.GroupType;

@Entity
@Table(name = "product_groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true,nullable = false)
    private GroupType groupType;

    public Group() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GroupType getGroup() {
        return groupType;
    }

    public void setGroup(GroupType groupType) {
        this.groupType = groupType;
    }
}
