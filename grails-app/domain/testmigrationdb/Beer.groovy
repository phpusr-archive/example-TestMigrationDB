package testmigrationdb

class Beer {
    enum Style { GERMAN_ALE, GERMAN_LAGER, BRITISH_ALE, BRITISH_LAGER, AMERICAN_ALE, AMERICAN_LAGER, OTHER }
    String name
    Style style
}
