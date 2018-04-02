package com.harana.sdk.parameters

import java.util.UUID

import com.harana.sdk.models.Parameter.ParameterId
import com.harana.sdk.models.plugin.Connection
import com.harana.sdk.models.{Parameter, ParameterValidator}}
import io.circe.generic.JsonCodec
import com.harana.sdk.util.CirceCodecs._

@JsonCodec
case class ConnectionParameter(title: String,
                               description: String,
                               group: Option[String],
                               default: Option[Connection] = None,
                               required: Boolean,
                               validators: List[ParameterValidator] = List(),
                               id: ParameterId = UUID.randomUUID()) extends Parameter with Serializable