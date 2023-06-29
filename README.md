# Appium Framework Architecture
Base architectural model for Appium Framework to use to test and automate Android applications. There are defined classes, functions and models which are ready to use in test cases &amp; scenarios.  



## Key features of framework used

**JAVA:** Most appropriate programming language for Appium.

**Maven:** General structure which can be used and adapted in every circumstances easily.

**TestNG:**  It is the most common framework and it provides powerful features and reporting.

**ExtentReport:** Basic report tool for tests which can be easily inspected in HTML docs.

**IRetryAnalyzer:** A plugin to re-try tests without getting error when only one step is failed.


## Base Methods & Functions to use in Test Scenarios

#### These functions can be used in all test cases if inherited from the BasePage class.



| Function | Explanation                |
| :--------  |:------------------------- |
| `findElement()`| It can be used to find element on the page with **By** class. |
| `sendKeys()`| It can be used to send values to text fields. |
| `click()`| It can be used to click specified element on the page. |
| `clear()`| It can be used to clear text fields before sending new values. |
| `swipe()`| It can be used to swipe page towards to entered x- y- locations. |
| `infoLog()`| Report test step to give info.|
| `passLog()`| Report test step to inform it is passed. |
| `failLog()`| Report test step to inform it is failed. |




## Test Scenarios

#### These are sample test scenarios which has been automated by using Appium for a Specific Android Food-Delivery app which I tested for my internship project:

| Test Case Name | Test Case Description                |
| :--------  |:------------------------- |
| `Login Page`| Automate user to login to the app when the app is launched. |
| `Signup Page`| Automate user to signup. |
| `Door Delivery`| Automate user to order food from the scratch. |
| `Checkout`| Automate user to proceed towards Checkout page and enter payment methods. |
| `Reorder`| Automate the repeating of a user's order. |
| `Deliver Later`| Automate user to order a late delivery by entering delivery time options.|
| `Store Credit`| Automate user to order by using Store credits.|


Feel free to contact me via [LinkedIn](https://www.linkedin.com/in/mehmetcanozceliik/).








  
