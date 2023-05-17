Feature: Job Search Test

  As a user I want to search jobs using different data set

  @smoke @regression
  Scenario Outline: User should be able to search jobs using different data set
    Given I am on home page
    When I accept all cookies
    And I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I click on more search option link
    And I enter minimum salary "<minSalary>"
    And I enter maximum salary "<maxSalary>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find jobs button
    Then I verify the navigation on result page "<result>"

    Examples:
      | jobTitle            | location    | distance | minSalary | maxSalary | salaryType | jobType   | result                                            |
      | Tester              | Harrow      | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow                   |
      | QA Tester           | Croydon     | 15 miles | 35000     | 400000    | Per month  | Contract  | Contract Qa Tester jobs in Croydon                |
      | Automation Tester   | London      | 7 miles  | 40000     | 300000    | Per week   | Permanent | Permanent Automation Tester jobs in London        |
      | Automation Engineer | East London | 2 miles  | 45000     | 500000    | Per annum  | Part Time | Part Time Automation Engineer jobs in East London |
      | Accountant          | London      | 5 miles  | 30000     | 50000     | Per month  | Contract  | Contract Accountant jobs in London                |
      | Warehouse Operative | London      | 15 miles | 1500      | 2000      | Per month  | Part Time | Part Time Warehouse Operative jobs in London      |