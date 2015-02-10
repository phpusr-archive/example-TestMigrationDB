databaseChangeLog = {

    changeSet(author: "phpusr (generated)", id: "1423575419007-1") {
        addColumn(tableName: "post") {
            column(name: "body", type: "longvarchar")
        }
    }

    changeSet(author: "phpusr (generated)", id: "1423575419007-2") {
        addColumn(tableName: "post") {
            column(name: "title", type: "varchar(255)")
        }
    }

    changeSet(author: "phpusr (generated)", id: "1423575419007-3") {
        dropColumn(columnName: "COMMENT", tableName: "POST")
    }
}
