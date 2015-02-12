package testmigrationdb

/**
 * Пример: http://refactr.com/blog/2012/01/grails-database-migration-gotchas/
 */
class Beer {
    enum Type { ALE, LAGER }
    enum Origin { GERMANY, BRITAIN, USA, OTHER }

    String name
    Type type
    Origin origin
}
