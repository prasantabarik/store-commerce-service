package com.tcs.service.validator

import com.tcs.service.constant.ExceptionMessage.BAD_PARAMETERS
import com.tcs.service.error.customexception.InvalidInputException
import com.tcs.service.model.Store
import org.springframework.stereotype.Component

@Component
class BaseValidator {

    fun validateBaseModel(model: Store) {
        with(model) {
            require(name.isEmpty()) { throw InvalidInputException(BAD_PARAMETERS) }
        }
    }


}