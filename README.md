# This is the Project with UI Autotests on 'Wildberries' website
Click [here](https://by.wildberries.ru/) to take a look at the website!

## Technology Stack used in the project:

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://web.telegram.org/"><img width="50" height="50"  alt="Telegram" src="images\logo\Telegram.svg"></a>
</p>

## This project has:

- PageObjects
- Parameterized build
- Owner.config
- Telegram notifications

## To run tests locally use:


```
gradle clean test 
```

## Jenkins job
Jenkins is an automation server which lets us run tests.
Click <a target="_blank" href="https://jenkins.autotests.cloud/job/10-anastasiachemko-project-wildberries">here</a> to see the job for Wildberries website.

Here is a sneak peek of how you can run the tests and which parameters you can specify:

<p align="center">
<img title="Parameters configuration" src="images/screens/jenkinsParams.png">
</p>

## Allure report
Allure Framework is a flexible test report tool that shows a  concise representation of what have been tested in a neat web report form

Here are an overview and graphs:

<p align="center">
<img title="Allure overview" src="images/screens/allureOverview.png">
</p>

<p align="center">
<img title="Allure overview" src="images/screens/allureGraphs.png">
</p>

## Telegram notifications
Notifications of test results are sent to Telegram:

<p align="center">
<img title="Allure overview" src="images/screens/tgNotification.png">
</p>

## Video example of a running test from Selenoid

<img src="images/gif/runningTest.gif">