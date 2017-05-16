# chsp

This application was generated using JHipster 3.12.1, you can find documentation and help at [https://jhipster.github.io/documentation-archive/v3.12.1](https://jhipster.github.io/documentation-archive/v3.12.1).
Based on Matt Raible book https://www.infoq.com/minibooks/jhipster-2-mini-book
Thanks Matt for that!

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:
1. [Node.js][]: We use Node to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools (like
[Bower][] and [BrowserSync][]). You will only need to run this command when dependencies change in package.json.

    npm install

We use [Gulp][] as our build system. Install the Gulp command-line tool globally with:

    npm install -g gulp-cli

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

    ./gradlew
    gulp

Bower is used to manage CSS and JavaScript dependencies used in this application. You can upgrade dependencies by
specifying a newer version in `bower.json`. You can also run `bower update` and `bower install` to manage dependencies.
Add the `-h` flag on any command to see how you can use it. For example, `bower update -h`.

For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].

## Building for production

To optimize the chsp application for production, run:

    ./gradlew -Pprod clean bootRepackage

This will concatenate and minify the client CSS and JavaScript files. It will also modify `index.html` so it references these new files.
To ensure everything worked, run:

    java -jar build/libs/*.war

Then navigate to [http://localhost:8080](http://localhost:8080) in your browser.

Refer to [Using JHipster in production][] for more details.

## Testing

To launch your application's tests, run:

    ./gradlew test

### Client tests

Unit tests are run by [Karma][] and written with [Jasmine][]. They're located in `src/test/javascript/` and can be run with:

    gulp test

UI end-to-end tests are powered by [Protractor][], which is built on top of WebDriverJS. They're located in `src/test/javascript/e2e`
and can be run by starting Spring Boot in one terminal (`./gradlew bootRun`) and running the tests (`gulp itest`) in a second one.
### Other tests

Performance tests are run by [Gatling][] and written in Scala. They're located in `src/test/gatling` and can be run with:

    ./gradlew gatlingRun

For more information, refer to the [Running tests page][].

[JHipster Homepage and latest documentation]: https://jhipster.github.io
[JHipster 3.12.1 archive]: https://jhipster.github.io/documentation-archive/v3.12.1

[Using JHipster in development]: https://jhipster.github.io/documentation-archive/v3.12.1/development/
[Using Docker and Docker-Compose]: https://jhipster.github.io/documentation-archive/v3.12.1/docker-compose
[Using JHipster in production]: https://jhipster.github.io/documentation-archive/v3.12.1/production/
[Running tests page]: https://jhipster.github.io/documentation-archive/v3.12.1/running-tests/
[Setting up Continuous Integration]: https://jhipster.github.io/documentation-archive/v3.12.1/setting-up-ci/

[Gatling]: http://gatling.io/
[Node.js]: https://nodejs.org/
[Bower]: http://bower.io/
[Gulp]: http://gulpjs.com/
[BrowserSync]: http://www.browsersync.io/
[Karma]: http://karma-runner.github.io/
[Jasmine]: http://jasmine.github.io/2.0/introduction.html
[Protractor]: https://angular.github.io/protractor/
