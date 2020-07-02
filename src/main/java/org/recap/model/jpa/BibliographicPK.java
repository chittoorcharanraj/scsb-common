package org.recap.model.jpa;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by pvsubrah on 7/7/16.
 */
@Getter
@Setter
public class BibliographicPK implements Serializable {
    private Integer owningInstitutionId;
    private String owningInstitutionBibId;

    /**
     * Instantiates a new Bibliographic pk.
     */
    public BibliographicPK() {
        //Do nothing
    }

    /**
     * Instantiates a new Bibliographic pk.
     *
     * @param owningInstitutionId    the owning institution id
     * @param owningInstitutionBibId the owning institution bib id
     */
    public BibliographicPK(Integer owningInstitutionId, String owningInstitutionBibId) {
        this.owningInstitutionId = owningInstitutionId;
        this.owningInstitutionBibId = owningInstitutionBibId;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(owningInstitutionId.toString()+owningInstitutionBibId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BibliographicPK bibliographicPK = (BibliographicPK) obj;
        return (bibliographicPK.getOwningInstitutionId().equals(owningInstitutionId) && bibliographicPK.getOwningInstitutionBibId().equals(owningInstitutionBibId));
    }
}
