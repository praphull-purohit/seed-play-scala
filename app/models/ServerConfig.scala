package models

import slick.jdbc.PostgresProfile.api._

trait ServerConfig {

  def db: Database

}
