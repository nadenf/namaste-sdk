package com.naden.sdk.models

import io.circe.generic.JsonCodec

@JsonCodec
case class Image(createdBy: Option[User],
                 title: String,
                 description: String,
                 fileName: String,
                 fileSize: Double,
                 width: Int,
                 height: Int,
                 mimeType: String)
    extends Entity
