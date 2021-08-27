package org.recap.model.reports;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TitleMatchCount {
    private String owningInst;
    private String cgd;
    private Long count;
    private String titleMatched;
}
