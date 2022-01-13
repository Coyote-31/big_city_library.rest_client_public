package com.coyote.big_city_library.rest_client_public.feign_clients;

import java.util.List;

import com.coyote.big_city_library.rest_client_public.dto.UserDto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "BigCityLibrary-RestServer", url = "localhost:9001", path = "/api/users")
public interface UserClient {
    
    @GetMapping("")
    List<UserDto> findAllUsers();
    
}
