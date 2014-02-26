cargo-test
==========

Simple project that uses the cargo maven plugin in integration test with several containers.

This project aims to see how the maven cargo plugin can be used to realize some integration test. The goal is to
deploy a WAR application on several containers, and check the application.

How to launch the tests
-----------------------

Tests can be launch using maven. Profiles are used to specify the container to use. When no profile is specified,
the jetty9x container is used (this is the default profile).


To launch the tests on the default profile (Jetty 9):

    mvn verify

To launch the tests on Tomcat 7:

    mvn verify -Ptomcat7x

You can check the available profiles to get all defined containers.
