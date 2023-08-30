package org.recap.model.jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by pvsubrah on 6/21/16.
 */
@XmlRootElement(name="bibRecord")
public class BibRecord implements Serializable{

    private Bib bib;
    private List<Holdings> holdings;

    /**
     * Gets bib.
     *
     * @return the bib
     */
    @XmlElement(name = "bib")
    public Bib getBib() {
        return bib;
    }

    /**
     * Sets bib.
     *
     * @param bib the bib
     */
    public void setBib(Bib bib) {
        this.bib = bib;
    }

    /**
     * Gets holdings.
     *
     * @return the holdings
     */
    @XmlElement(name = "holdings")
    public List<Holdings> getHoldings() {
        return holdings;
    }

    /**
     * Sets holdings.
     *
     * @param holdings the holdings
     */
    public void setHoldings(List<Holdings> holdings) {
        this.holdings = holdings;
    }

}
