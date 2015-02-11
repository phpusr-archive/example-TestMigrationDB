import testmigrationdb.Post

databaseChangeLog = {

	changeSet(author: "phpusr (generated)", id: "v0.3") {
        addColumn(tableName: "post") {
            column(name: "date_created", type: "datetime")
        }

        grailsChange {
            change {
                sql.execute("UPDATE post SET date_created = NOW()")
            }
            rollback {
            }
        }

        addNotNullConstraint(columnDataType: "datetime", columnName: "date_created", tableName: "post")
	}
}
