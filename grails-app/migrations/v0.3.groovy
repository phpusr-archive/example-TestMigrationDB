import testmigrationdb.Post

databaseChangeLog = {

	changeSet(author: "phpusr (generated)", id: "v0.3") {
        addColumn(tableName: "post") {
            column(name: "date_created", type: "datetime")
        }

        grailsChange {
            change {
                Post.all.each { post ->
                    post.dateCreated = new Date(101, 7, 15)
                    post.save(failOnError: true, flush: true)
                }
            }
            rollback {
            }
        }

        addNotNullConstraint(columnDataType: "datetime", columnName: "date_created", tableName: "post")
	}
}
