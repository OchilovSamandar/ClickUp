package uz.pdp.clickup.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickup.entity.template.AbsEntity;

import java.sql.Timestamp;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task extends AbsEntity {

    @Column(nullable = false)
    private String name;

    private String description;

    @ManyToOne
    private Status statusId;

    @ManyToOne
    private Priority priority;



    @ManyToOne
    private Category categoryId;

    private Timestamp startDate;

    private boolean startTimeHas;//soatlikmi

    private Timestamp dueDate;

    private boolean dueTimeHas;

    private Long estimateTime;

    private Timestamp activedDate;//qancha vaqt active bo'ldi
}
