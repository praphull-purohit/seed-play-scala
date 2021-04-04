package modules

import com.google.inject.{AbstractModule, Inject, Provider, Singleton}
import models.ServerConfig
import modules.ServerConfigModule.ServerConfigProvider
import play.api.Configuration
import slick.jdbc.PostgresProfile.api._

@Singleton
class ServerConfigModule extends AbstractModule {
  override protected def configure(): Unit = {
    bind(classOf[ServerConfig]).toProvider(classOf[ServerConfigProvider])
  }
}

object ServerConfigModule {

  @Singleton
  private class ServerConfigProvider @Inject()(configuration: Configuration) extends Provider[ServerConfig] {
    override val get: ServerConfig = new ServerConfig {
      override lazy val db = Database.forConfig("mydb")
    }
  }

}
