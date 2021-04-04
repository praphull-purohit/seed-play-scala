run-https:
	@sbt run -Dhttps.port=9443 -Dhttp.port=disabled -Dconfig.file=/opt/play-confs/seed-play-scala.conf -Dlogger.file=/opt/play-confs/seed-play-scala-logback.xml
run:
	@sbt run -Dconfig.file=/opt/play-confs/seed-play-scala.conf -Dlogger.file=/opt/play-confs/seed-play-scala-logback.xml
