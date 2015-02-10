databaseChangeLog = {

	changeSet(author: "phpusr (generated)", id: "1423473578400-1") {
		createTable(tableName: "post") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "postPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	include file: 'v0.1.groovy'
}
