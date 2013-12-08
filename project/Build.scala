import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "multi-project"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      jdbc,
      anorm,
      cache
    )

    val appResolvers = Seq ()
    val appScalacOptions = Seq( "-deprecation", "-unchecked", "-feature", "-language:reflectiveCalls")

    val common = play.Project(appName + "-common", appVersion, appDependencies, path = file("modules/common")).settings(
      resolvers ++= appResolvers,
      scalacOptions ++= appScalacOptions
    )

    val uistatic = play.Project(appName + "-ui-static", appVersion, appDependencies, path = file("modules/ui-static")).settings(
      resolvers ++= appResolvers,
      scalacOptions ++= appScalacOptions
    ).dependsOn(common)

    val uidynamic = play.Project(appName + "-ui-dynamic", appVersion, appDependencies, path = file("modules/ui-dynamic")).settings(
      resolvers ++= appResolvers,
      scalacOptions ++= appScalacOptions
    ).dependsOn(common)

    val main = play.Project(appName, appVersion, appDependencies).settings(
      resolvers ++= appResolvers,
      scalacOptions ++= appScalacOptions
    ).dependsOn(uistatic, uidynamic)
}
            
