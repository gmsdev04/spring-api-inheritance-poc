package br.com.github.gmsdev04.springapiinheritancepoc.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LegalPersonDto extends PersonDto {
    private String businessName;

    protected LegalPersonDto() {
        super(PersonType.LEGAL);
    }
}
