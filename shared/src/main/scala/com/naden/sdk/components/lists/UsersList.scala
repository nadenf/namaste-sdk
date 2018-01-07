package com.naden.sdk.components.lists

import com.naden.sdk.components.Component
import com.naden.sdk.models.User
import boopickle.Default._

case class UsersList(title: String,
            icon: String,
            users: List[User],
            showPosition: Boolean,
            showOnline: Boolean,
            showMessenging: Boolean) extends Component
