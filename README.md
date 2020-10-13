# QA-Assignment
Command-line Instructions
Prerequisites:
Install the latest version of Java and TestNG.
Set the environment variable
You may need to set your JAVA_HOME.

Eclipse Instructions
Prerequisites:

Install Eclipse, the TestNG, and optionally the GitHub plugin.
Set up Eclipse Preferences

Window > Preferences... (or on windows, Eclipse > Preferences...)

Create a new Java Project.
Choose the Location of the project to be the location of cmdline-sample
Select the project and Convert to Maven Project to add Maven Dependencies.
Click on Run > Run configurations
Navigate to your Java Application's configuration section
In the Arguments tab, add the name of the bucket you created above as a Program argument
In the Environment tab, create a variable GOOGLE_APPLICATION_CREDENTIALS and set it to the path to your json private key file.
Run

Right-click on project
Run As > Java Application

Package:
package com.quantinsti_Log_in_Verify;
class name:
public class Quantinsti_Log_in_Assignment_no_1 
Methods:
	public void Setup_Browser() 
  public void Setup_locator() throws Exception 
  
Steps follows  
1. Open Application - https://quantra.quantinsti.com
2. Click on the login button
3. Log in as username & password
4. Then click on the Browse Courses menu
5. And select the course - Sentiment Analysis in Trading
6. Get the Course name & Price
7. Then click on the Enroll now button (cart page gets open after clicking on
enrol now button)
8. On the cart page, get the courses name & count the number of the courses
present in the cart page and verify that the course count should match with the
number displayed in the cart icon.
9. Capture the Base Amount & Amount Payable info
10.Click on the View Details link of any course (a new browser tab gets open on
clicking on the View Details link. After that close the tab and get back to the
cart page )
11.After that remove any one course from the cart page by clicking remove link
and get the alert message text
12.Then click on the Apply coupon button and type ABC into the text box and
click on the Apply button and get the error message.
13.Then close the modal.
14. And Sign out from the application


