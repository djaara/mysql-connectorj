class MysqlConnectorjGrailsPlugin {
    def version = "5.1.22"
    def grailsVersion = "1.2.0 > *"
    def dependsOn = [:]
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def author = "Jaroslav Barton"
    def authorEmail = "djaara83k@gmail.com"
    def title = "MySQL Connector/J"
    def description = "MySQL Connector/J"
    def documentation = "http://grails.org/plugin/mysql-connectorj"
}
