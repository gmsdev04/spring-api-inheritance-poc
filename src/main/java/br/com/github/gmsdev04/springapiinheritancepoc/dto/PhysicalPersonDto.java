package br.com.github.gmsdev04.springapiinheritancepoc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PhysicalPersonDto extends PersonDto {

    private String name;

    protected PhysicalPersonDto() {
        super(PersonType.PHYSICAL);
    }
}
