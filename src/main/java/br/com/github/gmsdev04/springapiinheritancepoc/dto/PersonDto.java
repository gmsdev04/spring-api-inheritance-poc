package br.com.github.gmsdev04.springapiinheritancepoc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PhysicalPersonDto.class, name = "PHYSICAL"),
        @JsonSubTypes.Type(value = LegalPersonDto.class, name = "LEGAL")
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PersonDto {
    private final PersonType type;

    protected PersonDto(PersonType type) {
        this.type = type;
    }
}