package org.recap.model.jaxb;

import org.recap.model.jaxb.marc.ContentType;
import org.recap.model.jaxb.marc.MatchingInstitutionBibIdType;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pvsubrah on 6/21/16.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bib implements Serializable {
    @XmlElement(name = "owningInstitutionId")
    private String owningInstitutionId;
    @XmlElement(name = "owningInstitutionBibId")
    private String owningInstitutionBibId;

    @XmlElement(name= "content", required = true, nillable = true)
    protected ContentType content;

    @XmlElement
    protected List<MatchingInstitutionBibIdType> matchingInstitutionBibId;

    /**
     * Gets owning institution bib id.
     *
     * @return the owning institution bib id
     */
    public String getOwningInstitutionBibId() {
        return owningInstitutionBibId;
    }

    /**
     * Sets owning institution bib id.
     *
     * @param owningInstitutionBibId the owning institution bib id
     */
    public void setOwningInstitutionBibId(String owningInstitutionBibId) {
        this.owningInstitutionBibId = owningInstitutionBibId;
    }

    /**
     * Gets owning institution id.
     *
     * @return the owning institution id
     */
    public String getOwningInstitutionId() {
        return owningInstitutionId;
    }

    /**
     * Sets owning institution id.
     *
     * @param owningInstitutionId the owning institution id
     */
    public void setOwningInstitutionId(String owningInstitutionId) {
        this.owningInstitutionId = owningInstitutionId;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public ContentType getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(ContentType content) {
        this.content = content;
    }

    public List<MatchingInstitutionBibIdType> getMatchingInstitutionBibId() {
        return matchingInstitutionBibId;
    }

    public void setMatchingInstitutionBibId(List<MatchingInstitutionBibIdType> matchingInstitutionBibId) {
        this.matchingInstitutionBibId = matchingInstitutionBibId;
    }
}
