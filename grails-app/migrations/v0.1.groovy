databaseChangeLog = {

	changeSet(author: "phpusr (generated)", id: "1423639868355-1") {
		createTable(tableName: "post") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "postPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "body", type: "longtext")

			column(name: "title", type: "varchar(255)")
		}
	}
}
