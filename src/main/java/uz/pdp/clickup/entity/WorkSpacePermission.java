package uz.pdp.clickup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.enums.WorkSpacePermissionName;
import uz.pdp.clickup.entity.template.AbsEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpacePermission extends AbsEntity {


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private WorkSpaceRole workSpaceRoleId;//o'rinbosar,o'rinbosar

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.LAZY)
    private List<WorkSpacePermissionName> permissionName;//add_member,remove_memeber
}
