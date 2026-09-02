feature: Login


Scenario:
Validate the user is able to login using valid credentials


Given  Browser is open & url is navigated
And  Login page is displayed
When  User enter valid username & password
And  User should click on login button
Then User should be successfully logged in
And  Browser should close