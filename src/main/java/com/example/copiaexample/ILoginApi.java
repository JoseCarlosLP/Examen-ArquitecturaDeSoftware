package com.example.copiaexample;

import dto.ErrorResponseDto;
import dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

public interface ILoginApi {
    @Tag(name="Inicio",description = "Implementacion de Sentry")
    public String index();

    @Tag(name="Login",description = "Iniciar sesion con un usuario")
    @Operation(summary = "Iniciar Sesion")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200", description = "Inicio de sesion correcto",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = UserDto.class))}
            ),
            @ApiResponse(
                    responseCode = "400", description = "Solicitud incorrecta",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponseDto.class))}

            ),
            @ApiResponse(
                    responseCode = "500", description = "${api.responseCodes.internalServer.description}"
            ),
    })
    public ResponseEntity<UserDto> create(UserDto user);
}
