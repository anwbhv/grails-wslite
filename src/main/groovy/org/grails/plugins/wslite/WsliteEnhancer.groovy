package org.grails.plugins.wslite

import groovy.util.logging.Slf4j

@Slf4j
final class WsliteEnhancer {

    private WsliteEnhancer() {}

    static void enhance(MetaClass mc, WsliteProvider provider = WsliteConnector.instance) {
        log.debug "Enhancing $mc with $provider ..."

        Object[] argTypes = [Map, Closure] as Object[]

        ['withHttp', 'withRest', 'withSoap'].each { methodName ->
            if (!mc.respondsTo(null, methodName, argTypes)) {
                mc[methodName] = { Map params, Closure closure ->
                    provider."$methodName"(params, closure)
                }
            }
        }

        log.debug "... finished enhancing $mc with $provider"
    }

}
