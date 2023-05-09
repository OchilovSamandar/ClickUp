package uz.pdp.clickup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.template.AbsEntity;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space extends AbsEntity {
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private WorkSpace workSpaceId;

    @ManyToOne
    private User user;

    private String color;

    private String initialLetter;

    @ManyToOne
    private Icon iconId;

    @OneToOne
    private Attachment avatarId;

    private boolean accessType;//private yoki public bo'ladi
}
