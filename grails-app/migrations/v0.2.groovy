databaseChangeLog = {

	changeSet(author: "phpusr (generated)", id: "1423641842977-1") {
		addColumn(tableName: "post") {
			column(name: "author", type: "varchar(255)")
		}
	}
}
