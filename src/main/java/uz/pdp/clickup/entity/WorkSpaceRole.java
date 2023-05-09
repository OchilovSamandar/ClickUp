package uz.pdp.clickup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.enums.WorkSpaceRoleName;
import uz.pdp.clickup.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpaceRole extends AbsEntity {
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private WorkSpace workSpaceId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private WorkSpaceRoleName extendsRole;
}
