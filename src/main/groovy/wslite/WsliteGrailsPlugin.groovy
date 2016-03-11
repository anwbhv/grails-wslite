/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package wslite

import grails.plugins.Plugin

class WsliteGrailsPlugin extends Plugin {

    def grailsVersion = "3.0.0 > *"

    def pluginExcludes = [
            "web-app/css",
            "web-app/images",
            "web-app/js/prototype",
            "web-app/js/application.js"
    ]
    def observe = ["controllers", "services"]

    def title = "Wslite plugin"
    def author = "Mihai Cazacu"
    def authorEmail = "cazacugmihai@gmail.com"
    def description = '''This plugin brings the power of https://github.com/jwagenleitner/groovy-wslite library to your
Grails app. Thanks to Andres Almiray to provided code at https://github.com/griffon/griffon-wslite-plugin!'''

    def documentation = "http://grails.org/plugin/wslite"

    def license = "APACHE"

    def organization = [name: "Macrobit Software", url: "http://macrobit.ro/"]

    def developers = [
        [name: "Mihai Cazacu", email: "cazacugmihai@gmail.com"],
        [name: "Hans Bogaards", email: "hbogaards@gmail.com"]
    ]

    def issueManagement = [system: "GITHUB", url: "https://github.com/anwbhv/grails-wslite/issues"]

    def scm = [url: 'https://github.com/anwbhv/grails-wslite/']

}