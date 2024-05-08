package com.example.copiaexample;

import dto.CreditDto;
import dto.ErrorResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

public interface IPaymentApi {

    @Tag(name="Payment Method",description = "Pago con tarjeta de Credito")
    @Operation(summary = "Pay")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200", description = "Pago Correcto",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = CreditDto.class))}
            ),
            @ApiResponse(
                    responseCode = "400", description = "Pago Incorrecto",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ErrorResponseDto  .class))}
            ),
            @ApiResponse(
                    responseCode = "500", description = "${api.responseCodes.internalServer.description}"
            ),
    })
    public ResponseEntity<CreditDto> pay(CreditDto creditDto);
}
