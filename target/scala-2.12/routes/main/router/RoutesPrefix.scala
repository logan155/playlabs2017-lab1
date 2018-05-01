// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/helloworld/conf/routes
// @DATE:Tue May 01 11:18:48 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
