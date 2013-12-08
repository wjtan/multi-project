import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "ui-static"
    val appVersion      = "1.0-SNAPSHOT"

    

    val appDependencies = Seq(
      jdbc,
      anorm,
      cache
    )

    val appResolvers = Seq ()

    val uistatic = play.Project(appName, appVersion, appDependencies).settings(
      resolvers ++= appResolvers,
      scalacOptions ++= Seq( "-deprecation", "-unchecked", "-feature", "-language:reflectiveCalls"),
      unmanagedBase <<= baseDirectory(_ / "lib2")
    )
}
            
