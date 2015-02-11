import testmigrationdb.Post

class BootStrap {

    def init = { servletContext ->
        new Post(dateCreated: new Date(), author: 'phpusr').save(failOnError: true)
    }
    def destroy = {
    }
}
