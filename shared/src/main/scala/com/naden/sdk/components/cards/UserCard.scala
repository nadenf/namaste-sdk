package com.naden.sdk.components.cards

import com.naden.sdk.components.Component
import com.naden.sdk.models.User
import boopickle.Default._

case class UserCard(user: User,
            showIcon: Boolean,
            showPosition: Boolean,
            showSocial: Boolean,
            showMessaging: Boolean) extends Component
