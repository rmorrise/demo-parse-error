package demo.parse.error

class UrlMappings {

    static mappings = {
        "/"(controller: 'demo', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
