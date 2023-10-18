package com.example.project.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KakaoApiResponseDto {

    @JsonProperty("mata")
    private MetaDto metaDto;

    @JsonProperty("documents")
    private List<DocumentDto> documentList;

}
