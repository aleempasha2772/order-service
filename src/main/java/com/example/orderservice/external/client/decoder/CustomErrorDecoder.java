package com.example.orderservice.external.client.decoder;

import com.example.orderservice.exception.CustomException;
import com.example.orderservice.external.client.response.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.lang.reflect.Type;

@Log4j2
public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        ObjectMapper objectMapper = new ObjectMapper();
        log.info("::{}",response.request().url());
        log.info("::{}",response.request().headers());

        try{
            ErrorResponse errorResponse = objectMapper.readValue(response.body().asInputStream(),ErrorResponse.class);
            return new CustomException(errorResponse.getErrorMessage(),errorResponse.getErrorCode(),response.status());
        } catch (IOException e) {
            throw  new CustomException("Internal Server Error", "INTERNAL_SERVER_ERROR", 500);
        }
    }
}
