package models

import slick.jdbc.PostgresProfile.api._

import scala.language.implicitConversions

package object dao {
  implicit def serverConfigToDB(serverConfig: ServerConfig): Database = serverConfig.db
}
