package models.swagger

/**
 * Created by pitbul on 11/23/14.
 */
case class BearerToken(token: String)

case class UserAccountInfo(email: String, password: String, repeatPassword: String)