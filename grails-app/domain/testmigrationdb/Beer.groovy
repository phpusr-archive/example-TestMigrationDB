package testmigrationdb

class Beer {
    enum Type { ALE, LAGER }
    enum Origin { GERMANY, BRITAIN, USA, OTHER }

    String name
    Type type
    Origin origin
}
