package com.harana.sdk.models

import io.circe.generic.JsonCodec

@JsonCodec
case class Color(red: Int, green: Int, blue: Int, alpha: Double)

