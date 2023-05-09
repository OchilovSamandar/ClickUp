package uz.pdp.clickup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpace extends AbsEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User owner;

    @Column(nullable = false)
    private String initialLetter;

    @OneToOne(fetch = FetchType.LAZY)
    private Attachment avatarId;
}
