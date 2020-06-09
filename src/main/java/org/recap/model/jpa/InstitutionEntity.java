package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "institution_t", schema = "recap", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "INSTITUTION_ID"))
@Getter
@Setter
public class InstitutionEntity extends AbstractEntity<Integer> {

    @Column(name = "INSTITUTION_CODE")
    private String institutionCode;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;

}
