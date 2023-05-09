package uz.pdp.clickup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.enums.TaskPermission;
import uz.pdp.clickup.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CategoryUser extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Category categoryId ;

    @ManyToOne
    private User userId;

    @Enumerated(EnumType.STRING)
    private TaskPermission taskPermission;

}
