databaseChangeLog = {

    changeSet(author: "phpusr (generated)", id: "1423577817347-1") {
        createTable(tableName: "post") {
            column(autoIncrement: "true", name: "id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "postPK")
            }

            column(name: "version", type: "bigint") {
                constraints(nullable: "false")
            }

            column(name: "body", type: "longvarchar")

            column(name: "title", type: "varchar(255)")
        }
    }
}
