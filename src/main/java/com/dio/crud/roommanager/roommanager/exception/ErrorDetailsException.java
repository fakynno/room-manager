package com.dio.crud.roommanager.roommanager.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorDetailsException {

    private Date timestamp;
    private String message;
    private String details;
}
