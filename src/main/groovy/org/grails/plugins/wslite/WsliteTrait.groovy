package org.grails.plugins.wslite

import grails.artefact.Enhances

@Enhances(["Controller", "Service"])
trait WsliteTrait {

    WsliteProvider provider = WsliteConnector.instance

    Object withHttp(Map params, Closure closure) {
        provider.withHttp(params, closure)
    }

    Object withSoap(Map params, Closure closure) {
        provider.withSoap(params, closure)
    }

    Object withRest(Map params, Closure closure) {
        provider.withRest(params, closure)
    }
}