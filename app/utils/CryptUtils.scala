package utils

import com.github.t3hnar.bcrypt._

object CryptUtils {

  def encryptPassword(password: String) = {
    password.bcrypt
  }

}
