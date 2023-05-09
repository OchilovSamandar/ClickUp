package uz.pdp.clickup.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
public class Category extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Project projectId ;


//    private Space spaceId;

    @Column(nullable = false)
    private boolean accessType;//private yoki public

    @Column(nullable = false)
    private boolean archived = false;


    private String color;
//
//    private String initialLetter;
//
//    @ManyToOne
//    private Icon iconId;
//
//    @OneToOne
//    private Attachment avatarId;


}
