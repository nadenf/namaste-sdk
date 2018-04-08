package com.harana.sdk.parameters

import java.util.UUID

import com.harana.sdk.models.Parameter.ParameterId
import com.harana.sdk.models.{Parameter, ParameterValidator}
import io.circe.generic.JsonCodec

@JsonCodec
case class TagsParameter(name: String,
                         description: String,
                         group: Option[String],
                         default: Option[String] = None,
                         required: Boolean,
                         limit: Option[Int] = None,
                         allowDuplicates: Boolean = true,
                         validators: List[ParameterValidator] = List(),
                         id: ParameterId = UUID.randomUUID()) extends Parameter with Serializable

