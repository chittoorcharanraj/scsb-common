package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "institution_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "INSTITUTION_ID"))
@Getter
@Setter
public class InstitutionEntity extends AbstractEntity<Integer> {

    @Column(name = "INSTITUTION_CODE")
    private String institutionCode;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;

    @Column(name = "ILS_PROTOCOL")
    private String ilsProtocol;

}
