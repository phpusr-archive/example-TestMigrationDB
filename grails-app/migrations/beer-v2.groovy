import testmigrationdb.Beer

databaseChangeLog = {

    // Замена столбца style на origin и type
	changeSet(author: "phpusr (generated)", id: "beer-v2") {

        // Добавление столбца origin
		addColumn(tableName: "beer") {
			column(name: "origin", type: "varchar(255)", defaultValue: Beer.Origin.OTHER) {
				constraints(nullable: "false")
			}
		}

        // Добавление столбца type
        addColumn(tableName: "beer") {
			column(name: "type", type: "varchar(255)", defaultValue: Beer.Type.ALE) {
				constraints(nullable: "false")
			}
		}

        // Перенос значений из style в origin и type
        grailsChange {
            change {
                // set origins
                sql.executeUpdate "UPDATE BEER SET ORIGIN = 'GERMANY' WHERE STYLE LIKE 'GERMAN_%'"
                sql.executeUpdate "UPDATE BEER SET ORIGIN = 'BRITAIN' WHERE STYLE LIKE 'BRITISH_%'"
                sql.executeUpdate "UPDATE BEER SET ORIGIN = 'USA' WHERE STYLE LIKE 'AMERICAN_%'"

                // set types
                sql.executeUpdate "UPDATE BEER SET TYPE = 'ALE' WHERE STYLE LIKE '%_ALE'"
                sql.executeUpdate "UPDATE BEER SET TYPE = 'LAGER' WHERE STYLE LIKE '%_LAGER'"
            }
        }

        // Удаление столбца style
        dropColumn(columnName: "style", tableName: "beer")

	}

}
