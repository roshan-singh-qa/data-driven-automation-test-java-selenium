# DataDriven Test

# QA Automation

This repository uses Selenium, via a local Chrome Driver or a Remote Driver that connects to a Selenium Grid.

Note: Maven needs to download the internet so this will take some time on first run. The command will populate
your local Maven cache to speed things up on subsequent runs.

## Running Java and Maven on host

To run the test on host you'll need to install Java (11+) and Maven. For this reason it's not recommended
unless you know what you're doing. Once you've installed Java, Maven and possibly the Chrome Driver, run test as above.

## Running using your host Chrome installation

To run tests against your host Chrome Browser you'll need to download the latest
[Chrome Driver](https://chromedriver.chromium.org/downloads) for your platform. If you're running on Linux or
Mac, ensure the Driver is executable.

Specify the Chrome Dri`ver when running the test.

```shell script
mvn test -DconfigPath=./env/prod.properties -Dwebdriver.chrome.driver=/path/to/chromedriver
```
- GroupName
  - To Run particular group of Test Cases: -DexcludedGroups=GroupName
  - To exclude test case: -DexcludedGroups=GroupName

- ConfigFile
  - To Run Test Cases on specific environment: -DconfigPath=./env/prod.properties