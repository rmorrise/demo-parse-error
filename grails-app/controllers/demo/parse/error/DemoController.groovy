package demo.parse.error

import com.rmorrise.demo.SearchResult

class DemoController {
	static responseFormats = ['json']
	
    def index() {
        def transientDomainObject = new CustomerContext()
        def result = new SearchResult(firstItem: 'foo', secondItem: transientDomainObject, thirdItem: 'bar')
        respond result
    }
}
