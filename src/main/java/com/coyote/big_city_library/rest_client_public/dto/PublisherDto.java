package com.coyote.big_city_library.rest_client_public.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class PublisherDto {

    private Integer id;

    @NonNull
    private String name;
}
