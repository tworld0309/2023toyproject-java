package com.boot3.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TbPriceDTO {
    private String itemCd;
    private Integer price;
    private String regId;
    private LocalDate regDt;
    private String modId;
    private LocalDate modDt;
}
