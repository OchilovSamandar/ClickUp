package uz.pdp.clickup.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.enums.DependencyType;
import uz.pdp.clickup.entity.template.AbsEntity;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskHistory extends AbsEntity {

    @ManyToOne
    private Task taskId;

    private String changeFieldName;

    private Timestamp before;

    private Timestamp after;

    private String data;

    @Enumerated(EnumType.STRING)
    private DependencyType dependencyType;//waiting,blocking,links

}
