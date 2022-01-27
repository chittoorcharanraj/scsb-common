package org.recap.model.reports;

import lombok.Data;


@Data
public class TitleMatchCount {
    private String owningInst;
    private String cgd;
    private Long count;
    private String titleMatched;
}
