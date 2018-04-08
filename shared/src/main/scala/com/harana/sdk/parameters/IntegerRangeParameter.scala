package com.harana.sdk.parameters

import java.util.UUID

import com.harana.sdk.models.Parameter.ParameterId
import com.harana.sdk.models.{Parameter, ParameterValidator}
import io.circe.generic.JsonCodec

@JsonCodec
case class IntegerRangeParameter(name: String,
                                 description: String,
                                 group: Option[String],
                                 default: Option[Integer] = None,
                                 required: Boolean,
                                 minimumValue: Integer = 0,
                                 maximumValue: Integer = 100,
                                 validators: List[ParameterValidator] = List(),
                                 id: ParameterId = UUID.randomUUID()) extends Parameter with Serializable
