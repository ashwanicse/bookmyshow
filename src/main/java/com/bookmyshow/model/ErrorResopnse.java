package com.bookmyshow.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResopnse {
	int statusCode;
	String reponseMessage;

}
