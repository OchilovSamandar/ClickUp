package uz.pdp.clickup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.enums.DependencyType;
import uz.pdp.clickup.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskDependency extends AbsEntity {

    @ManyToOne
    private Task taskId;

    private String dependencyTaskId;

    @Enumerated(EnumType.STRING)
    private DependencyType dependencyType;//waiting,blocking,links

}
