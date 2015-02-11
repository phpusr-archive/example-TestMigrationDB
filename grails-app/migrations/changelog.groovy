databaseChangeLog = {

    changeSet(author: "phpusr (generated)", id: "changelog") {
        // add changes and preconditions here
    }

	include file: 'v0.1.groovy'
	include file: 'v0.2.groovy'
	include file: 'v0.3.groovy'

    include file: 'add-beer.groovy'

//    include file: 'test.groovy'
}
