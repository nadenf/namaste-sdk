package com.naden.sdk.models
import boopickle.Default._

case class Group(createdBy: User,
                 title: String,
                 users: Set[User] = Set.empty)
    extends Object(createdBy)
