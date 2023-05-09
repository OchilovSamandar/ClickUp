package uz.pdp.clickup.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
public class Status extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Project projectId;

    @OneToOne
    private Space spaceId;

    @ManyToOne
    private Category categoryId;


    private String color;

    private String type;//OPEN,CUSTOM,CLOSED

}
