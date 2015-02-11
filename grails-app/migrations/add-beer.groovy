databaseChangeLog = {

	changeSet(author: "phpusr (generated)", id: "add-beer") {
		createTable(tableName: "beer") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "beerPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "style", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
