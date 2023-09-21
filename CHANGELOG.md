## Change log
----------------------

Version 6.1-SNAPSHOT
-------------



Version 6
-------------

ADDED:

- new class module-info.java that provides this library as a module
- new gradle-plugin dependency 'org.ajoberstar.grgit:grgit-gradle' in version 5.2.0
- update of gradle-plugin dependency 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.21.0

CHANGED:

- update of JDK to newer version 17
- update gradle to new version 8.4-rc-1
- update of gradle-plugin dependency 'com.github.ben-manes.versions.gradle.plugin' to new version 0.48.0
- removed deprecated methods
- removed unused dependency threeten-extra
- adapted repository structure to fit better with gradle

Version 5.4
-------------

ADDED:

- new enum class DatePattern with all date patterns from the obsolet interface DatePatterns
- new test dependency silly-collections for testing in version 8.7
- new class StringDatePatternExtensions for resolve date patterns

CHANGED:

- update of gradle to new version 7.2
- update of dependency threeten-extra version to 1.7.0
- update gradle-plugin dependency of gradle.plugin.com.hierynomus.gradle.plugins:license-gradle-plugin to new version 0.16.1
- remove obsolete interface DatePatterns

Version 5.3
-------------

CHANGED:

- changed to new package io.github.astrapi69
- update of gradle to new version 6.9
- update of dependency threeten-extra version to 1.6.0
- update of test dependency testng to new version 7.4.0

Version 5.2
-------------

ADDED:

- gradle as build system

CHANGED:

- changed project nature from maven to gradle nature
- removed maven related files
- removed lombok dependency
- update of dependency threeten-extra version to 1.5.0

Version 5.1
-------------

CHANGED:

- unit tests extended for improve code coverage to 100%
- deleted unused method CalculateDateExtensions#calculateTimeFromNow
- deleted unused method CalculateDateExtensions#calculateElapsedTimeInSeconds
- deleted unused class TimeZoneExtensions

Version 5
-------------

CHANGED:

- update of parent version to 4.4
- removed old log4j in version 1.* configuration files
- update to log4j2 configuration files
- replaced obsolet joda-time with new threeten-extra dependency in version 1.4

Version 4.12
-------------

ADDED:

- this changelog file
- new method that calculated the time in seconds

CHANGED:

- update of parent version to 3.12
- removed unneeded .0 at the end of version
- changed old packages to new in package.html
- javadoc extended and improved
- update of dependency joda-time version to 2.10
- unit tests extended for improve code coverage
